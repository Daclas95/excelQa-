package test;

import pages.admin.AdminPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.TestBase;

public class HrmTesting extends TestBase {
    @Test(priority = 0)
    public void Skills() {
       softAssert = new SoftAssert();
        AdminPage.Qualification();
        AdminPage.Skills();
        softAssert.assertTrue(AdminPage.isAdminDashboardHeaderDisplayed(),"Skill dashboard not displaed");
        AdminPage.AddBtn();
        AdminPage.SkillsNameDescription("csjhxxxr","kakkafxaaa");
        AdminPage.SaveCheckboxDelete();
        softAssert.assertAll();
    }
    @Test(priority = 1)
    public void Education() {
        softAssert = new SoftAssert();
        AdminPage.Qualification();
        AdminPage.Education();
        softAssert.assertTrue(AdminPage.isEducationDisplayed(),"Education dashboard not displaed");
        AdminPage.AddBtn();
        AdminPage.EduLevel("jjj");
        AdminPage.SaveCheckboxDelete();
        softAssert.assertAll();
    }
    @Test(priority = 2)
    public void Licenses()  {
        softAssert = new SoftAssert();
        AdminPage.Qualification();
        AdminPage.Licenses();
        softAssert.assertTrue(AdminPage.isLicensesDisplayed(),"Qualification dashboard not displaed");
        AdminPage.AddBtn();
        AdminPage.LicenceName("Licence");
        AdminPage.SaveCheckboxDelete();
        softAssert.assertAll();
    }
    @Test(priority = 3)
    public void Languages(){
        softAssert = new SoftAssert();
        AdminPage.Qualification();
        AdminPage.Languages();
        softAssert.assertTrue(AdminPage.isLanguagesDisplayed(),"Languages dashboard not displaed");
        AdminPage.AddBtn();
        AdminPage.LanguagesName("Java");
        AdminPage.SaveCheckboxDelete();
        softAssert.assertAll();
    }
    @Test(priority = 4)
    public void Membership() {
        softAssert = new SoftAssert();
        AdminPage.Qualification();
        AdminPage.Membership();
        softAssert.assertTrue(AdminPage.isMembershipsDisplayed(),"Membership dashboard not displaed");
        AdminPage.AddBtn();
        AdminPage.Membershipname("QA");
        AdminPage.MemSaveCheckboxDelete();
        softAssert.assertAll();
    }
}
