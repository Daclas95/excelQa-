package pages;

import org.openqa.selenium.By;
import utils.PageBase;

import java.util.logging.Logger;

public class DashboardPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(LoginPage.class));
    private static By HrmDashboardHeader =By.xpath("//h1");

    public static boolean isHrmDashboardPageDisplayed() {
        return getDriver().findElement(HrmDashboardHeader).isDisplayed();

    }
}
