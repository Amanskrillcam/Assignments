package TestBase;

import PageFactory.Objectfactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.naming.spi.ObjectFactory;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {
    public static WebDriver driver;
    public static Properties prop;
    protected static Objectfactory obj;
public Base()
{
     try
    {
        prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\Config\\config.properties");
        prop.load(fis);
    } catch (FileNotFoundException e)
    {
        e.printStackTrace();
    }
     catch (IOException e)
    {
        e.printStackTrace();
    }
}

    public static void initialization()
    {
        obj = new Objectfactory();
        String browsername = prop.getProperty("browser");
        if (browsername.equals("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else
        {
            System.out.println("invalid browser");
        }
        driver.manage().window().maximize();
        //driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(prop.getProperty("url"));
    }


}
