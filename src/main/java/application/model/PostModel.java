package application.model;

import application.request.attachments.AttachmentsList;
import framework.logger.MyLogger;

public class PostModel {
    private static final MyLogger LOGGER = new MyLogger();

    private String name;
    private Long id;
    private String text;
    private User user;
    private AttachmentsList attachments = AttachmentsList.create();

    public PostModel(String name, Long id, String text, User user) {
        this.name = name;
        this.id = id;
        this.text = text;
        this.user = user;
    }

    public PostModel(String text, User user, String name) {
        this.name = name;
        this.text = text;
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public Long getID() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public User getUser() {
        return user;
    }

    public AttachmentsList getAttachments() {
        return attachments;
    }

    public void setAttachments(AttachmentsList attachments) {
        this.attachments = attachments;
    }
}
