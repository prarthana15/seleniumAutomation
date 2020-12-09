package baseTest.tests;
import baseTest.webPages.MoonlyteLaunchPage;
import baseTest.webPages.SignInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class signinTest {
    WebDriver driver;
    // Create object of class MoonlyteLaunchPage
    MoonlyteLaunchPage objMoonlyteLaunchPage;

    // Create object of class Registration
    SignInPage objSignInPage;

    @BeforeTest
    public void setupTest() {

        System.setProperty("webdriver.chrome.driver", "C:/Users/User/seleniumAutomation/src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://moon:Invictus%2301@www.qa.moonlyte.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        
    }
    @Test(priority=1)
    public void launchMoonlyte() {
        objMoonlyteLaunchPage = new MoonlyteLaunchPage(driver);
        objMoonlyteLaunchPage.clickonSignInLink();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Check if page is opened
        String ExpectedTitle = "Sign In | Moonlyte";
        String ActualTitle = driver.getTitle();
        Assert.assertEquals(ExpectedTitle,ActualTitle,"Title is not matched");


    }
    @Test(priority=2)
    public void manualSignIn(){
        objSignInPage = new SignInPage(driver);
        //Fill up data
        objSignInPage.setManualSignInEmail("prarthana.p@moonlyte.com" );
        objSignInPage.clickOnProceed();
        objSignInPage.enterPassword("Moonlyte#01");
        objSignInPage.clickOnSignIn();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String ExpectedTitle = "Onboard | Moonlyte";
        String ActualTitle = driver.getTitle();
        Assert.assertEquals(ExpectedTitle,ActualTitle,"Title is not matched");

        driver.quit();

    }
}



