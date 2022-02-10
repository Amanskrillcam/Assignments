package StepDefinations;

import Pages.HomePage;
import Pages.LoginPage;
import TestBase.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class LoginDef extends Base
{
//   public static WebDriver driver;
//    HomePage homepage=new HomePage();
//    LoginPage login;
    public LoginDef(){super();}

    @Given("user is on login page")
    public void user_is_on_login_page() throws IOException
    {
        initialization();
//        driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
    }

    @Then("user is clicking on forgot password button")
    public void user_is_clicking_on_forgot_password_button()
    {
//        driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]")).click();
//        driver.navigate().back();
//        login=new LoginPage();
        obj.getlogin().forgotpass();
    }

    @Then("User enters username and password")
    public void user_enters_username_and_password() throws IOException
    {
        obj.getlogin().userlogin();
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button()
    {

        obj.getlogin().clicklogin();
    }

    @Then("user is on Homepage")
    public void user_is_on_Homepage()
    {
        obj.getlogin().validatehomepagetitle();
    }
//    @Then("^user is logging out$")
//    public void user_is_logging_out()
//    {
//        driver.findElement(By.partialLinkText("Welcome")).click();
//        driver.findElement(By.partialLinkText("Logout")).click();
//        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//    }
//    @Then("^Closing browser$")
//    public void Closing_browser()
//    {
//        driver.quit();
//    }

}




