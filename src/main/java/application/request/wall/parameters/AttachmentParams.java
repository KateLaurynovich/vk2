package application.request.wall.parameters;

public enum AttachmentParams {

    FILE("file"),
    GROUP_ID("group_id"),
    PHOTO("photo"),
    SERVER("server"),
    HASH("hash"),
    USER_ID("user_id"),
    LATITUDE("latitude"),
    LONGITUDE("longitude"),
    CAPTION("caption");

    private String title;

    AttachmentParams(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
