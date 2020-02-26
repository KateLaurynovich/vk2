package application.forms;

import application.model.CommentModel;
import application.model.PostModel;
import application.serializableObject.PhotoParam;
import framework.elements.Button;
import framework.elements.Label;
import framework.logger.MyLogger;
import framework.utils.RegEx;
import org.openqa.selenium.By;

public class Post {

    private static final MyLogger LOGGER = new MyLogger();

    private static String post = "//div[@id = 'post%d_%d']";
    private static String text = "wpt%d_%d";
    private static String textPost = "%s//div[contains(@class, 'wall_post_text')]";
    private static String postAuthor = "%s//a[@class = 'author']";
    private static String photo = "%s//a[@href='/photo%d_%d']";
    private static String photoLink = "//a[@href='/photo%d_%d']//img";
    private static String closeBtn = "pv_close_btn";
    private static String allComment = "//div[@id = 'replies%d_%d']//a";
    private static String commentAuthor = "%s//a[@class = 'author']";
    private static String like = "//div[@class = 'like_wrap _like_wall%d_%d ']//a[contains(@class, '_like')]";
    private static String replies = "%s/..";
    private static String file = "%s//a[@class = 'page_doc_title']";


    private Label getPost(PostModel postModel) {
        return new Label(By.xpath(String.format(post, postModel.getUser().getUserId(), postModel.getID())), postModel.getName());
    }

    public String getText(PostModel postModel) {
        String postText = String.format(post, postModel.getUser().getUserId(), postModel.getID());
        return new Label(By.xpath(String.format(textPost, postText)), "text_" + postModel.getName()).getText();
    }

    public String getTextComment(CommentModel commentModel) {
        return new Label(By.id(String.format(text, commentModel.getUser().getUserId(), commentModel.getID())),
                "text_" + commentModel.getID()).getText();
    }

    private Label getPostAuthor(PostModel postModel) {
        String postID = String.format(post, postModel.getUser().getUserId(), postModel.getID());
        return new Label(By.xpath(String.format(postAuthor, postID)), "Author_" + postModel.getName());
    }

    public void clickAllComment(PostModel postModel) {
        new Label(By.xpath(String.format(allComment, postModel.getUser().getUserId(), postModel.getID())),
                "all comment" + postModel.getName()).clickElement();
    }

    public void clickCloseBtn() {
        new Button(By.className(closeBtn), "closeBtn").clickElement();
    }

    public void clickLike(PostModel postModel) {
         new Label(By.xpath(String.format(like, postModel.getUser().getUserId(), postModel.getID())), "like").clickElement();
    }

    public Long getAuthorID(PostModel postModel) {
        Long userID = Long.valueOf(RegEx.findMatcher("\\d{1,10}", getPostAuthor(postModel).getAttribute("href")));
        LOGGER.info("userID = ", userID);
        return userID;
    }

    public String getDocName(PostModel postModel) {
        String postID = String.format(post, postModel.getUser().getUserId(), postModel.getID());
        String docName = new Label(By.xpath(String.format(file, postID)), "docName").getText();
        LOGGER.info("doc name = ", docName);
        return docName;
    }

    public void clickPhoto(PostModel postModel, PhotoParam photoParam) {
        String postID = String.format(post, postModel.getUser().getUserId(), postModel.getID());
        new Label(By.xpath(String.format(photo, postID, postModel.getUser().getUserId(), photoParam.getId())),
                "photo = " + photoParam.getId()).clickElement();
    }

    public String getLinkPhoto(PostModel postModel, PhotoParam photoParam) {
        return new Label(By.xpath(String.format(photoLink, postModel.getUser().getUserId(), photoParam.getId())),
                "photoLink = " + photoParam.getId()).getAttribute("src");
    }

    public Long getCommentAuthor(CommentModel commentModel) {
        String postID = String.format(post, commentModel.getUser().getUserId(), commentModel.getID());
        Label commentAuthorLbl = new Label(By.xpath(String.format(commentAuthor, postID)), "CommentAuthor_" + commentModel.getID());
        return Long.parseLong(commentAuthorLbl.getAttribute("data-from-id"));
    }

    public String getRepliesPostID(CommentModel commentModel) {
        String postID = String.format(post, commentModel.getUser().getUserId(), commentModel.getID());
        return new Label(By.xpath(String.format(replies, postID)), "Replies " + commentModel.getID()).getAttribute("id");
    }

    public boolean isUnShownPost(PostModel postModel) {
        LOGGER.info("post is removed  = " + getPost(postModel).getAttribute("class").contains("unshown"));
        return getPost(postModel).getAttribute("class").contains("unshown");
    }

    public boolean isDisplayed(PostModel postModel) {
        return getPost(postModel).isDisplayed();
    }
}



