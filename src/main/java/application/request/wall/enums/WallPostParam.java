package application.request.wall.enums;

public enum WallPostParam {
    OWNER_ID("owner_id"),
    FRIENDS_ONLY("friends_only"),
    FROM_GROUP("from_group"),
    MESSAGE("message"),
    ATTACHMENTS("attachments"),
    SERVICES("services"),
    SIGNED("signed"),
    PUBLISH_DATE("publish_date"),
    LAT("lat"),
    LONG("long"),
    PLACE_ID("place_id"),
    POST_ID("post_id"),
    GUID("guid"),
    MARK_AS_ADS("mark_as_ads"),
    CLOSE_COMMENTS("close_comments"),
    MUTE_NOTIFICATIONS("mute_notifications");

    private String title;

    WallPostParam(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
