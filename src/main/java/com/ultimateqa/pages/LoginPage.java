package com.ultimateqa.pages;


import com.ultimateqa.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * Created by Jay Vaghani
 */
public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(linkText = "Sign In")
    WebElement signInText;
//    By signInText = By.linkText("Sign In");

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome Back!')]")
    WebElement verifyText;
//    By verifyText = By.xpath("//h1[contains(text(),'Welcome Back!')]");

    @CacheLookup
    @FindBy(id = "user[email]")
    WebElement emailId;
//    By emailID = By.id("user[email]");

    @CacheLookup
    @FindBy(name = "user[password]")
    WebElement passwardField;
    //    By passwardField = By.name("user[password]");
    @CacheLookup
    @FindBy(xpath = "//button[@class='button button-primary g-recaptcha']")
    WebElement loginButton;
//    By loginButton = By.xpath("//input[@class='button button-primary g-recaptcha']");

    public void signInLink(String signin) {
        Reporter.log("Click on signin" + signInText.toString());
        clickOnElement(signInText);
    }

    public String getVerifyText() {
        Reporter.log("Verify text" + verifyText.toString());
        return getTextFromElement(verifyText);
    }
    /*verify text
   String expectedMessage = "Welcome Back!";
   String actualMessage = getTextFromElement(By.xpath("//h1[@class='page__heading']"));
       Assert.assertEquals("Welcome Back!",expectedMessage,actualMessage);

    */

    public void enterEmail(String email) {
        Reporter.log("Enter email" + email + "to email ID" + emailId.toString());
        sendTextToElement(emailId, email);
    }

    public void enterPassward(String passward) {
        Reporter.log("Enter passward" + passward + "to passward Field" + passwardField.toString());
        sendTextToElement(passwardField, passward);
    }

    public void clickOnLoginButton() {
        Reporter.log("Clicking on login button" + loginButton.toString());
        clickOnElement(loginButton);
    }

}















