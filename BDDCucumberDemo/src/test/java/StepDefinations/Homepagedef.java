package StepDefinations;

import Pages.HomePage;
import Pages.LoginPage;
import TestBase.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import junit.framework.TestCase;


import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Homepagedef extends Base {


    public Homepagedef() {
       super();
    }

    @Given("user logggedin and user is on Homepage")
    public void user_is_on_Homepage() throws IOException
    {
        initialization();
        obj.getlogin().userlogin();
        obj.getlogin().clicklogin();
        Assert.assertEquals("OrangeHRM",driver.getTitle());
    }

    @When("^user clicks on admin button$")
    public void AdminModule()
    {
        obj.gethomepage().validateAdminModule();
    }

    @When("^user clicks on PIM button$")
    public void Pim() {obj.gethomepage().validatePim();}

    @When("^user clicks on leave button$")
    public void leave() {obj.gethomepage().validateleave();}

    @When("^user clicks on time button$")
    public void time() {obj.gethomepage().validatetime();}

    @When("^user clicks on recruitment button$")
    public void recruitment() {obj.gethomepage().validaterecruitment();}

    @When("^user clicks on Myinfo button$")
    public void myinfo() {obj.gethomepage().validatemyinfo();}

    @When("^user clicks on performance button$")
    public void performance() {obj.gethomepage().validateperformance();}

    @When("^user clicks on Dashboard button$")
    public void dashboard() {obj.gethomepage().validatedashboard();}

//    public void directory() {obj.gethomepage().validatedirectory();}
//
//    public void maintenance() {obj.gethomepage().validatemaintenance();}
//
//    public void buzz() {obj.gethomepage().validatebuzz();}
    @Then("^user is logging out$")
    public void logout() {obj.gethomepage().logout();}
}
