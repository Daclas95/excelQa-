package test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DashboardPage;
import pages.LoginPage;
import pages.admin.AdminPage;
import utils.TestBase;

public class SkillTest extends TestBase {
    @Test(priority = 1,groups = "REGRESSION",dataProviderClass = SkillData.class, dataProvider = "SkillTestData")
    public void SkillTest(String SName,String Describtion) {
        LoginPage.setUserName("Admin");
        LoginPage.setPass("admin123");
        LoginPage.ClickLogin();
        AdminPage.AdminPageDisplayed();
        AdminPage.Qualification();
        AdminPage.Skills();
        AdminPage.AddBtn();
        AdminPage.SkillsNameDescription(SName,Describtion);
        AdminPage.SaveCheckboxDelete();

    }
}
