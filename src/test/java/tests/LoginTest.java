package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

        LoginPage loginPage;

        @BeforeMethod
        public void loginSetup(){
            loginPage = new LoginPage(driver);
        }

        @Test(description = "Login user happy path; Expected result: user is successfully logged in")
        public void loginUserTest(){
            loginPage.goToLoginPage();
            loginPage.loginUser("danita.hane@yahoo.com" , "L!w4cDT6&");
            String expectedText = "My account";
            Assert.assertEquals(loginPage.actualText(), expectedText, "User is not logged in");;
        }

}
