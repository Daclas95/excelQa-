package pages;

import org.openqa.selenium.By;
import utils.PageBase;

import java.util.logging.Logger;


public class LoginPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(LoginPage.class));
    private static By TxtUsername= By.id("txtUsername");
    private static By TxtPassworld= By.id("txtPassword");
    private static By btnLogin= By.id("btnLogin");
    private static By HrmHeader =By.id("logInPanelHeading");




    public static boolean isHrmLoginPageDisplayed() {
        return getDriver().findElement(HrmHeader).isDisplayed();

    }
    public static void setUserName(String username) {
       getDriver().findElement(TxtUsername).sendKeys(username);
       LOGGER.info("Entered Username");


    }

    public static void setPass(String pass) {
        getDriver().findElement(TxtPassworld).sendKeys(pass);

    }
    public static void ClickLogin() {
        getDriver().findElement(btnLogin).click();

    }
}
