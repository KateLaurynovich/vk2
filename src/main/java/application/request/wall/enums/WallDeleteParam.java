package application.request.wall.enums;

public enum WallDeleteParam {
    OWNER_ID("owner_id"),
    POST_ID("post_id");

    private String title;

    WallDeleteParam(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
