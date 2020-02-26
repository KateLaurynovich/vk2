package application.request.attachments;

import application.model.User;
import application.request.attachments.enums.AttachmentParam;
import framework.logger.MyLogger;

import java.util.HashMap;

public class AttachmentsList {
    private static MyLogger LOGGER = new MyLogger();
    public static AttachmentsList create() {
        return new AttachmentsList();
    }

    private final HashMap<AttachmentParam, Long> attachments;

    private AttachmentsList() {
        attachments = new HashMap<>();
    }

    public AttachmentsList add(AttachmentParam key, Long value) {
        attachments.put(key, value);
        return this;
    }


    public String build(User user) {
        if (attachments.isEmpty()) return "";
        final StringBuilder result = new StringBuilder();
        attachments.keySet().stream().forEach(key -> {
            result.append(key.getTitle()).append(user.getUserId().toString()).append("_").append(attachments.get(key)).append(",");
        });
        result.deleteCharAt(result.length()-1);
        LOGGER.info(result.toString());

        return result.toString();
    }
}

