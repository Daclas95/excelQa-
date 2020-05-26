package pages.admin;

import pages.LoginPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import utils.PageBase;

public class AdminPage extends PageBase {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(LoginPage.class));
    private static By Admin =By.xpath("//a[@id=\"menu_admin_viewAdminModule\"]");
    private static By Qualification =By.xpath("//a[@id=\"menu_admin_Qualifications\"]");
    private static By Skills =By.xpath("//a[@id=\"menu_admin_viewSkills\"]");
    private static By AddBtn =By.id("btnAdd");
    private static By Name =By.id("skill_name");
    private static By Description =By.id("skill_description");
    private static By SaveBtn =By.id("btnSave");
    private static By checkBox =By.xpath("//input[@type=\"checkbox\"]");
    private static By DeleteBtn =By.id("btnDel");
    private static By Education =By.xpath("//a[@id=\"menu_admin_viewEducation\"]");
    private static By EduLevel =By.id("education_name");
    private static By Licenses =By.xpath("//a[@id=\"menu_admin_viewLicenses\"]");
    private static By LiName =By.id("license_name");
    private static By Languages =By.xpath("//a[@id=\"menu_admin_viewLanguages\"]");
    private static By LaName =By.id("language_name");
    private static By Membership =By.xpath("//a[@id=\"menu_admin_membership\"]");
    private static By MemName =By.id("membership_name");
    private static By DeleteMBtn =By.id("btnDelete");
    private static By DialogDBtn =By.xpath("//input[@id=\"dialogDeleteBtn\"]");
    private static By skillDisplayed =By.xpath("//*[@id=\"recordsListDiv\"]/div[1]/h1");
    private static By EducationDisplayed =By.xpath("//*[@id=\"recordsListDiv\"]/div[1]/h1");
    private static By LicensesDisplayed =By.xpath("//*[@id=\"recordsListDiv\"]/div[1]/h1");
    private static By LanguagesDisplayed =By.xpath("//*[@id=\"recordsListDiv\"]/div[1]/h1");
    private static By MembershipsDisplayed =By.xpath("//*[@id=\"search-results\"]/div[1]/h1");

    public static void AdminPageDisplayed(){
        getDriver().findElement(Admin).click();
    }

    public static boolean isAdminDashboardHeaderDisplayed() {
        return getDriver().findElement(skillDisplayed).isDisplayed();
    }

    public static boolean isEducationDisplayed() {
        return getDriver().findElement(EducationDisplayed).isDisplayed();
    }

    public static boolean isLicensesDisplayed() {
        return getDriver().findElement(LicensesDisplayed).isDisplayed();
    }

    public static boolean isLanguagesDisplayed() {
        return getDriver().findElement(LanguagesDisplayed).isDisplayed();
    }

    public static boolean isMembershipsDisplayed(){
        return getDriver().findElement(MembershipsDisplayed).isDisplayed();
    }

    public static void Qualification(){
        getDriver().findElement(Qualification).click();
    }

    public static void Skills(){
        getDriver().findElement(Skills).click();
    }

    public static void SkillsNameDescription(String SName, String Describtion)  {
        getDriver().findElement(Name).sendKeys(SName);
        getDriver().findElement(Description).sendKeys(Describtion);
    }

    public static void Education(){
        getDriver().findElement(Education).click();
    }

    public static void EduLevel(String subject1){
        getDriver().findElement(EduLevel).sendKeys(subject1);
    }

    public static void Licenses(){
        getDriver().findElement(Licenses).click();
    }

    public static void LicenceName(String LicName){
        getDriver().findElement(LiName).sendKeys(LicName);
    }

    public static void Languages(){
        getDriver().findElement(Languages).click();
    }

    public static void LanguagesName(String LanName){
        getDriver().findElement(LaName).sendKeys(LanName);
    }

    public static void Membership(){
        getDriver().findElement(Membership).click();
    }


    public static void AddBtn(){
        getDriver().findElement(AddBtn).click();
    }

    public static void SaveCheckboxDelete(){
        getDriver().findElement(SaveBtn).click();
        getDriver().findElement(checkBox).click();
        getDriver().findElement(DeleteBtn).click();
    }
    public static void MemSaveCheckboxDelete()  {
        getDriver().findElement(SaveBtn).click();// i have used before
        getDriver().findElement(checkBox).click();// i have used before
        getDriver().findElement(DeleteMBtn).click();// i have used before
        getDriver().findElement(DialogDBtn).click();
    }

    public static void Membershipname ( String Memname){
        getDriver().findElement(MemName).sendKeys(Memname);
    }
}
