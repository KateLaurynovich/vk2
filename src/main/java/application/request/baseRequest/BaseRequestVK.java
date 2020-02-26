package application.request.baseRequest;

import application.model.User;
import application.request.wall.parameters.Params;
import framework.logger.MyLogger;
import framework.utils.PropertiesManager;

public class BaseRequestVK {
    private static MyLogger LOGGER = new MyLogger();

    public static String baseRequestVK(String method, Params parameters, User user) {
        String link = PropertiesManager.getProperties("server") + method + parameters.build()
                + BaseParameters.TOKEN.getTitle() + "=" + PropertiesManager.getProperties(user.getToken()) + "&"
                + BaseParameters.VERSION.getTitle() + "=" + PropertiesManager.getProperties("version");
        LOGGER.info(link);
        return link;
    }
}
