package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {
    @When("I click on register link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @And("I should navigate to register page successfully")
    public void iShouldNavigateToRegisterPageSuccessfully() {
    }

    @Then("I should see register text {string}")
    public void iShouldSeeRegisterText(String registerText) {
        String actualRegisterText = new RegisterPage().getTextOfRegister();
        Assert.assertEquals(actualRegisterText, registerText, "Page not redirect successfully");
    }

    @And("I click on register button")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @And("I see error message for first name {string}")
    public void iSeeErrorMessageForFirstName(String errorMessage) {
        String actualErrorText = new RegisterPage().getTextOfFirstName();
        Assert.assertEquals(actualErrorText, errorMessage, "Error Message not displayed");
    }

    @And("I see error message for last name {string}")
    public void iSeeErrorMessageForLastName(String errorMessage) {
        String actualErrorText = new RegisterPage().getTextOfLastName();
        Assert.assertEquals(actualErrorText, errorMessage, "Error Message not displayed");
    }

    @And("I see error message for email {string}")
    public void iSeeErrorMessageForEmail(String errorMessage) {
        String actualErrorText = new RegisterPage().getTextOfEmail();
        Assert.assertEquals(actualErrorText, errorMessage, "Error Message not displayed");
    }

    @And("I see error message for password {string}")
    public void iSeeErrorMessageForPassword(String errorMessage) {
        String actualErrorText = new RegisterPage().getTextOfPassword();
        Assert.assertEquals(actualErrorText, errorMessage, "Error Message not displayed");
    }

    @Then("I see error message for confirm password {string}")
    public void iSeeErrorMessageForConfirmPassword(String errorMessage) {
        String actualErrorText = new RegisterPage().getTextOfConfirmPassword();
        Assert.assertEquals(actualErrorText, errorMessage, "Error Message not displayed");
    }

    @And("I select gender female")
    public void iSelectGenderFemale() {
        new RegisterPage().clickOnGenderFemale();
    }

    @Then("I see registration success message {string}")
    public void iSeeRegistrationSuccessMessage(String registerSuccessMessage) {
        String actualRegisterSuccessText = new RegisterPage().getValueOfRegistrationSuccessMessage();
        Assert.assertEquals(actualRegisterSuccessText, registerSuccessMessage, "Registration not completed successfully");
    }

    @And("I enter first name {string}")
    public void iEnterFirstName(String firstName) {
        new RegisterPage().enterValueToFirstNameField(firstName);
    }

    @And("I enter last name {string}")
    public void iEnterLastName(String lastName) {
        new RegisterPage().enterValueToLastNameField(lastName);
    }

    @And("I select day {string}")
    public void iSelectDay(String day) {
        new RegisterPage().selectDay(day);
    }

    @And("I select month {string}")
    public void iSelectMonth(String month) {
        new RegisterPage().selectMonth(month);
    }

    @And("I select year {string}")
    public void iSelectYear(String year) {
        new RegisterPage().selectYear(year);
    }

    @And("I enter email for registration {string}")
    public void iEnterEmailForRegistration(String email) {
        new RegisterPage().enterValueToEmailField(email);
    }

    @And("I enter password for registration {string}")
    public void iEnterPasswordForRegistration(String password) {
        new RegisterPage().enterValueToPasswordField(password);
    }

    @And("I enter confirm password for registration {string}")
    public void iEnterConfirmPasswordForRegistration(String confirmPassword) {
        new RegisterPage().enterValueToConfirmPasswordField(confirmPassword);
    }
}
