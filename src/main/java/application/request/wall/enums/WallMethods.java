package application.request.wall.enums;

public enum WallMethods {

    WALL_POST("wall.post"),
    WALL_EDIT("wall.edit"),
    WALL_CREATE_COMMENT("wall.createComment"),
    WALL_DELETE("wall.delete");

    private String title;

    WallMethods(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
