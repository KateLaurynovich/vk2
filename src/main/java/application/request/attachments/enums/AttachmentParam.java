package application.request.attachments.enums;

public enum AttachmentParam {

    PHOTO("photo"),
    VIDEO("video"),
    AUDIO("audio"),
    DOC("doc"),
    PAGE("page"),
    NOTE("note"),
    POLL("poll"),
    ALBUM("album"),
    MARKET("market"),
    AUDIO_PLAYLIST("audio_playlist"),
    MARKET_ALBUM("market_album");

    private String title;

    AttachmentParam(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
