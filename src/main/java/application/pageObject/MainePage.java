package application.pageObject;

import framework.elements.Button;
import framework.elements.Input;
import framework.logger.MyLogger;
import org.openqa.selenium.By;

public class MainePage {
    private static final MyLogger LOGGER = new MyLogger();

    private static final String mailId = "index_email";
    private static final String passId = "index_pass";
    private static final String loginBtnLoc = "index_login_button";

    public void submitEmail(String email) {
        Input inputEmail = new Input(By.id(mailId), "index_email");
        inputEmail.submitInput(email);
    }

    public void submitPassword(String password) {
        Input inputPassword = new Input(By.id(passId), "index_email");
        inputPassword.submitInput(password);
    }

    public void clickLoginBtn() {
        Button loginBtn = new Button(By.id(loginBtnLoc), "index_login_button");
        loginBtn.clickElement();
    }

    public void authorization(String email, String password) {
        LOGGER.info("authorization user name = " + email);
        submitEmail(email);
        submitPassword(password);
        clickLoginBtn();
    }
}
