package application.request.wall.enums;

public enum EditPostParam {
    OWNER_ID("owner_id"),
    POST_ID("post_id"),
    FRIENDS_ONLY("friends_only"),
    MESSAGE("message"),
    ATTACHMENTS("attachments"),
    SERVICES("services"),
    SIGNED("signed"),
    PUBLISH_DATE("publish_date"),
    LAT("lat"),
    LONG("long"),
    PLACE_ID("place_id"),
    MARK_AS_ADS("mark_as_ads"),
    CLOSE_COMMENTS("close_comments"),
    POSTER_BKG_ID("poster_bkg_id"),
    POSTER_BKG_OWNER_ID("poster_bkg_owner_id"),
    POSTER_BKG_ACCESS_HASH("poster_bkg_access_hash");


    private String title;

    EditPostParam(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
