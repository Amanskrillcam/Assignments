package Pages;

import TestBase.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
//import static TestBase.Base.driver;
//import static TestBase.Base.prop;

public class LoginPage extends Base {
    String uname,upass;
    String path;

    //page factory or object repo
    @FindBy(id = "txtUsername")
    WebElement usname;
    @FindBy(id = "txtPassword")
    WebElement uspass;
    @FindBy(id = "btnLogin")
    WebElement loginbtn;
    @FindBy(partialLinkText = "Forgot your password?")
    WebElement forgotpassbtn;
    //initializing page objects

    public LoginPage()
    {
        PageFactory.initElements(driver,this);
    }

    //Actions
    public String Validateloginpagetitle()
    {
        return driver.getTitle();
    }

    public void userlogin() throws IOException
    {
        usname.sendKeys(prop.getProperty("username"));
        uspass.sendKeys(prop.getProperty("password"));

//        //Step1 give path of the file
//        path = System.getProperty("user.dir")+"\\TestData\\Test_data.xlsx";
//        System.out.println(path);
//
//        //.Step2 give path in fileinputstream class from where we want to add file
//        FileInputStream fis = null;
//        try
//        {
//            fis = new FileInputStream(path);
//        }
//        catch (FileNotFoundException e)
//        {
//            e.printStackTrace();
//        }
//        //step3 move to workbook
//        XSSFWorkbook wb = new XSSFWorkbook(fis);
//        //step4 move to specific sheet
//        XSSFSheet sheet = wb.getSheetAt(0);
//        //Step5 read rows from excel sheet
//        System.out.println(sheet.getLastRowNum());
//        //Step6 read data from cell
//        //String usrname=sheet.getRow(1).getCell(0).getStringCellValue();
//        //System.out.println("username is"+usrname);
//        for (int i = 1; i <= sheet.getLastRowNum(); i++)
//        {
//            uname = sheet.getRow(i).getCell(0).getStringCellValue();
//            usname.sendKeys(uname);
//            upass=sheet.getRow(i).getCell(1).getStringCellValue();
//            uspass.sendKeys(upass);
//            loginbtn.click();
//            System.out.println("username and password"+" "+uname+" "+upass);
//        }
    }
    public void clicklogin()
    {
        loginbtn.click();
    }
    public void forgotpass()
    {
        forgotpassbtn.click();
        driver.navigate().back();
    }
    public void validatehomepagetitle()
    {
        Assert.assertEquals("OrangeHRM",driver.getTitle());
    }
}
