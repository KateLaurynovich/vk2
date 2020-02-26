package application.request.baseRequest;

public enum BaseParameters {
    TOKEN("access_token"),
    VERSION("v");

    private String title;

    BaseParameters(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
