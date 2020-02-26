package application.request.wall.enums;

public enum CreateCommentParam {
    OWNER_ID("owner_id"),
    POST_ID("post_id"),
    FROM_GROUP("from_group"),
    MESSAGE("message"),
    REPLY_TO_COMMENT("reply_to_comment"),
    ATTACHMENTS("attachments"),
    STICKER_ID("sticker_id"),
    GUID("guid");

    private String title;

    CreateCommentParam(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
