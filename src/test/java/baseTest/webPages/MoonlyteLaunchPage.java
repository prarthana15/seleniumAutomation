package baseTest.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MoonlyteLaunchPage {
    WebDriver driver;

    //Page URL
    public static String PAGE_URL="https://www.qa.moonlyte.com";

    //Locators
    By signinLink = new By.ByLinkText("SIGN IN");
    By grid = new By.ByXPath("//app-header/nav[1]/div[2]/form[1]/div[1]/ul[1]/li[1]/a[1]/i[1]");
    By procapIcon = new By.ByXPath("app-header/nav[1]/div[2]/form[1]/div[1]/ul[1]/li[1]/div[1]/ul[1]/li[3]/a[1]/img[1]");
    //Constructor
    public MoonlyteLaunchPage (WebDriver driver) {
        this.driver = driver;
    }
    public void clickonGrid(){
        driver.findElements(grid).click();
    }
    public void selectProcap(){
        driver.findElement(procapIcon).click();
    }
    public void clickonSignInLink(){

        driver.findElement(signinLink).click();
    }
}
