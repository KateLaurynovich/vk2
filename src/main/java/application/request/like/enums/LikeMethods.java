package application.request.like.enums;

public enum  LikeMethods {
    LIKE_IS_LIKED("likes.isLiked");

    private String title;

    LikeMethods(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
