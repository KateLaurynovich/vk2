package application.request.like;

import application.model.PostModel;
import application.model.User;
import application.request.baseRequest.BaseRequestVK;
import application.request.like.enums.LikeMethods;
import application.request.like.enums.LikeParam;
import application.request.wall.parameters.Params;
import application.serializableObject.LikeIs;
import com.fasterxml.jackson.databind.ObjectMapper;
import framework.api.HttpConnection;
import framework.logger.MyLogger;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.io.StringReader;

public class Likes {
    private static final MyLogger LOGGER = new MyLogger();

    public static LikeIs likesIsLiked(PostModel postModel, User user, User requestUser) {
        Params params = Params.create()
                .add(LikeParam.USER_ID.getTitle(), user.getUserId().toString())
                .add(LikeParam.TYPE.getTitle(), "post")
                .add(LikeParam.ITEM_ID.getTitle(), postModel.getID().toString());
        String link = BaseRequestVK.baseRequestVK(LikeMethods.LIKE_IS_LIKED.getTitle(), params, requestUser);
        JSONObject jsonResp = HttpConnection.getStringResponse(link);
        JSONObject jsonObject = (JSONObject) jsonResp.get("response");
        StringReader reader = new StringReader(jsonObject.toString());
        LikeIs likeIs = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            likeIs = mapper.readValue(reader, LikeIs.class);
        } catch (IOException e) {
            LOGGER.error("IOException", e);
        }
        LOGGER.info("liked = ", likeIs);
        return likeIs;
    }
}
