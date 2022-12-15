package com.ultimateqa.testsuite;


import com.ultimateqa.customlisteners.CustomListeners;
import com.ultimateqa.pages.LoginPage;
import com.ultimateqa.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by Jay Vaghani
 */

public class LoginPageTest extends BaseTest {
    LoginPage loginpage;

    @BeforeMethod(alwaysRun = true)
    public void inIT(){

    loginpage = new LoginPage();
    }
@Test(groups = {"sanity","regression"})
public void verifyUserShouldNavigaateToLoginPageSuccessfully() {
    loginpage.signInLink("Sign In");
    String expectedMessage = "Welcome Back!";
    Assert.assertEquals(loginpage.getVerifyText(),expectedMessage,"Message is not displayed");
}
    @Test(groups = {"smoke","regression"})
    public void verifyTheErrorMessage () {
        loginpage.signInLink("Sign In");
        loginpage.enterEmail("123@gmail.com");
        loginpage.enterPassward("secret123");
        loginpage.clickOnLoginButton();
    }

}
