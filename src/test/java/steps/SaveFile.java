package steps;

import application.request.wall.parameters.AttachmentParams;
import application.model.PostModel;
import application.model.User;
import application.request.attachments.Files;
import application.request.attachments.Photo;


import application.serializableObject.PhotoParam;
import framework.logger.MyLogger;

public class SaveFile {
    private static final MyLogger LOGGER = new MyLogger();

    public static PhotoParam savePhoto(PostModel postModel, String path, AttachmentParams parameters, User user) {
        LOGGER.info("save photo");
        return Photo.saveWallPhoto(postModel,Photo.getUpload(postModel, path, parameters, user), user);
    }

    public static Long saveFile(PostModel postModel, String path, AttachmentParams parameters, User user) {
        LOGGER.info("save file");
        return Files.docsSave(postModel, Files.getUpload(postModel, path, parameters, user), user).getId();
    }
}