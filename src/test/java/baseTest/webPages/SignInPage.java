package baseTest.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.testng.AssertJUnit.assertEquals;

public class SignInPage {
    public WebDriver driver;
    By heading = By.xpath("1");
    By manualSignInEmail = By.xpath("//input[@id='emailInput']");
    By SignInButton = By.xpath("//button[@id='mlui14']");
    By password = By.xpath("//input[@id='password']");
    By SignIn =By.xpath("//button[@id='mlui14']");

    // @FindBy(xpath = "//div[@id='mlui11']")
        private WebElement googleRegistrationButton;

        // @FindBy(xpath = "//div[@id='mlui10']")
        private WebElement facebookRegistrationButton;

    //Constructor
    public SignInPage(WebDriver driver){
        this.driver = driver;
    }


    // To check if page is opened
    public void verifyHeader(){
        String getheadertext = driver.findElement(heading).getText().trim();
        assertEquals ("Sign In to your Account", getheadertext);
    }

    public void setManualSignInEmail(String email){
        driver.findElement(manualSignInEmail).sendKeys(email);
    }
    public void clickOnProceed(){
        driver.findElement(SignInButton).click();
    }
    public void enterPassword(String pwd){
        driver.findElement(password).sendKeys(pwd);
    }
    public void clickOnSignIn() {
        driver.findElement(SignIn).click();
    }
}
