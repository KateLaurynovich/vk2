package application.serializableObject;

import com.fasterxml.jackson.annotation.JsonProperty;

import framework.logger.MyLogger;

import java.io.Serializable;

public class WallPost implements Serializable {

    private static final MyLogger LOGGER = new MyLogger();

    @JsonProperty("post_id")
    private Long postId;

    public WallPost() {
        LOGGER.info("Wall Post create");
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    @Override
    public String toString() {
        return "WallPost{"
                + "postId=" + postId + '}';
    }
}
