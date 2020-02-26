package application.model;

public class CommentModel {

    PostModel postModel;
    Long ID;
    User user;

    public CommentModel(PostModel postModel, Long ID, User user) {
        this.postModel = postModel;
        this.ID = ID;
        this.user = user;
    }

    public PostModel getPostModel() {
        return postModel;
    }

    public Long getID() {
        return ID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
