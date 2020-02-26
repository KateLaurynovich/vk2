package application.request.like.enums;

public enum LikeParam {
    USER_ID("user_id"),
    TYPE("type"),
    ITEM_ID("item_id");

    private String title;

    LikeParam(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
