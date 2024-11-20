package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage{


    private By emailFiled = By.id("email");
    private By passwordFiled = By.cssSelector("input[data-test='password']");
    private By loginButton = By.cssSelector(".btnSubmit");
    private By myAccountPageTitle = By.cssSelector("h1[data-test='page-title']");
    private By signInLink = By.cssSelector("a[data-test='nav-sign-in']");
    private WebDriverWait wait;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void goToLoginPage(){
        clickOnElement(signInLink);
            }

    public void loginUser(String username, String password){
        typeIn(emailFiled, username);
        typeIn(passwordFiled, password);
        clickOnElement(loginButton);
    }

    public String actualText(){
        return getElement(myAccountPageTitle).getText();
    }

 }
