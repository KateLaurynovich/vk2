package application.request.attachments.enums;

public enum AttachmentMethods {

    PHOTOS_GET_WALL_UPLOAD_SERVER("photos.getWallUploadServer"),
    DOCS_GET_WALL_UPLOAD_SERVER("docs.getWallUploadServer"),
    PHOTOS_SAVE_WALL_PHOTO("photos.saveWallPhoto"),
    DOCS_SAVE("docs.save");

    private String title;

    AttachmentMethods(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
