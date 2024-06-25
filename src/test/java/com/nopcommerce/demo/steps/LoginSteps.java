package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I click on login link")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("I should navigate to login page successfully")
    public void iShouldNavigateToLoginPageSuccessfully() {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new LoginPage().getWelcomeText();
        Assert.assertEquals(actualMessage, expectedMessage, "Login page not displayed");
    }

    @And("I enter email {string}")
    public void iEnterEmail(String email) {
        new LoginPage().enterEmailId(email);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should login successfully")
    public void iShouldLoginSuccessfully() {
    }

    @Then("I should see the error message {string}")
    public void iShouldSeeTheErrorMessage(String errorMessage) {
        String actualErrorMessage = new LoginPage().getErrorMessage();
        Assert.assertEquals(actualErrorMessage, errorMessage, "Error message not displayed");

       // Assert.assertEquals(new LoginPage().getErrorMessage(), errorMessage, "Error message not displayed");
    }

    @Then("I should see the welcome message {string}")
    public void iShouldSeeTheWelcomeMessage(String welcomeMessage) {
        String actualWelcomeMessage = new LoginPage().getWelcomeMessage();
        Assert.assertEquals(actualWelcomeMessage, welcomeMessage, "Welcome message not displayed");
    }

    @Then("I should see logout link")
    public void iShouldSeeLogoutLink() {
        String expectedLogoutText = "Log out";
        String actualLogoutText = new LoginPage().getLogoutText();
        Assert.assertEquals(actualLogoutText, expectedLogoutText, "Logout link not displayed");
    }

    @And("I click on logout link")
    public void iClickOnLogoutLink() {
        new LoginPage().clickOnLogoutLink();
    }

    @Then("I should see login link")
    public void iShouldSeeLoginLink() {
        String expectedLoginLink = "Log in";
        String actualLoginLink = new LoginPage().getLoginText();
        Assert.assertEquals(actualLoginLink, expectedLoginLink, "Logout page not displayed");
    }
}
