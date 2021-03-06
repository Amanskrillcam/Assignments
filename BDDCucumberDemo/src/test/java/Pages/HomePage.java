package Pages;

import TestBase.Base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ultilities.utils;

import java.time.Duration;

//import static TestBase.Base.driver;

public class HomePage extends Base
{
    @FindBy(id = "menu_admin_viewAdminModule")
    WebElement admin;
    @FindBy(id = "menu_pim_viewPimModule")
    WebElement pim;
    @FindBy(id = "menu_leave_viewLeaveModule")
    WebElement leave;
    @FindBy(id = "menu_time_viewTimeModule")
    WebElement time;
    @FindBy(id = "menu_recruitment_viewRecruitmentModule")
    WebElement recruitment;
    @FindBy(id = "menu_pim_viewMyDetails")
    WebElement myinfo;
    @FindBy(id = "menu__Performance")
    WebElement performance;
    @FindBy(id = "menu_dashboard_index")
    WebElement dashboard;
    @FindBy(id = "menu_directory_viewDirectory")
    WebElement directory;
    @FindBy(id = "menu_maintenance_purgeEmployee")
    WebElement maintenance;
    @FindBy(id = "menu_buzz_viewBuzz")
    WebElement buzz;
    @FindBy(partialLinkText = "Welcome")
    WebElement Welcomebtn;
    @FindBy(partialLinkText = "Logout")
    WebElement logoutbtn;


    public HomePage()
    {
        PageFactory.initElements(driver,this);
    }


    public void validateAdminModule()
    {
        admin.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(utils.IMPLI_WAIT));
    }
    public void validatePim()
    {
        pim.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(utils.IMPLI_WAIT));
    }
    public void validateleave ()
    {
        leave.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(utils.IMPLI_WAIT));
    }
    public void validatetime ()
    {
        time.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(utils.IMPLI_WAIT));
    }
    public void validaterecruitment ()
    {
        recruitment.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(utils.IMPLI_WAIT));
    }
    public void validatemyinfo ()
    {
        myinfo.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(utils.IMPLI_WAIT));
    }
    public void validateperformance ()
    {
        performance.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(utils.IMPLI_WAIT));
    }
    public void validatedashboard ()
    {
        dashboard.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(utils.IMPLI_WAIT));
    }
    public void validatedirectory ()
    {
        directory.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(utils.IMPLI_WAIT));
    }
    public void validatemaintenance ()
    {
        maintenance.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(utils.IMPLI_WAIT));
    }
    public void validatebuzz ()
    {
        buzz.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(utils.IMPLI_WAIT));
    }
    public void logout()
    {
        Welcomebtn.click();
        logoutbtn.click();
    }
}
