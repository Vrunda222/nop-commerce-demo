package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Jay Vaghani
 */
public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    //welcomeMessage
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeMessage;

    //logout link
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logoutLink;

    //login link
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement loginLink;

    public String getWelcomeText() {
        String message = getTextFromElement(welcomeText);
        log.info("Getting text from : " + welcomeText.toString());
        return message;
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getErrorMessage() {
        return getTextFromElement(errorMessage);
    }

    public void loginToApplication(String email, String password) {
        enterEmailId(email);
        enterPassword(password);
        clickOnLoginButton();
    }

    public String getWelcomeMessage(){
        return getTextFromElement(welcomeMessage);
    }

    public String getLogoutText(){
        return getTextFromElement(logoutLink);
    }

    public String getLoginText(){
        return getTextFromElement(loginLink);
    }

    public void clickOnLogoutLink(){
        clickOnElement(logoutLink);
    }
}
