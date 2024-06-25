package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    //Register Text
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement registerText;

    //Register Button
    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;

    //First name
    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstName;

    //Last name
    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastName;

    //Email Id
    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement email;

    //Password
    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement password;

    //Confirm Password
    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPassword;

    //Gender female
    @CacheLookup
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement genderFemale;

    //first name field
    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameField;

    //last name field
    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameField;

    //last name field
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dayDropdown;

    //last name field
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement monthDropdown;

    //last name field
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement yearDropdown;

    //email field
    @CacheLookup
    @FindBy(name = "Email")
    WebElement emailField;

    //password field
    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;

    //confirm password field
    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;

    //confirm password field
    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement registrationSuccessMessage;

    public String getTextOfRegister(){
        String registerTxt = getTextFromElement(registerText);
        Reporter.log("Get text from welcome text " + registerText.toString());
        return registerTxt;
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
        Reporter.log("Click on register button " + registerButton.toString());

    }
    public String getTextOfFirstName(){
        String name = getTextFromElement(firstName);
        Reporter.log("Get text from first name error message " + firstName.toString());

        return name;

    }
    public String getTextOfLastName(){
        String name = getTextFromElement(lastName);
        Reporter.log("Get text from last name " + lastName.toString());

        return name;
    }
    public String getTextOfEmail(){
        String name = getTextFromElement(email);
        Reporter.log("Get text from email id error message " + email.toString());

        return name;
    }
    public String getTextOfPassword(){
        String name = getTextFromElement(password);
        Reporter.log("Get text from password error message " + password.toString());

        return name;
    }
    public String getTextOfConfirmPassword(){
        String name = getTextFromElement(confirmPassword);
        Reporter.log("Get text from confirm password error message " + confirmPassword.toString());

        return name;
    }
    public void clickOnGenderFemale(){
        clickOnElement(genderFemale);
        Reporter.log("Click on gender female " + genderFemale.toString());

    }
    public void enterValueToFirstNameField(String firstName){
        Reporter.log("Enter first name "+ firstName + "to first name field " + firstNameField.toString());

        sendTextToElement(firstNameField, firstName);
    }
    public void enterValueToLastNameField(String lastName){
        Reporter.log("Enter last name "+ password + "to last name field " + lastNameField.toString());

        sendTextToElement(lastNameField, lastName);
    }
    public void selectDay(String day){
        Reporter.log("Enter day "+ day +"from dropdown list" + dayDropdown.toString());

        selectByValueFromDropDown(dayDropdown, day);
    }

    public void selectMonth(String month){
        Reporter.log("Enter month "+ month +"from dropdown list" + monthDropdown.toString());

        selectByValueFromDropDown(monthDropdown, month);
    }

    public void selectYear(String year){
        Reporter.log("Enter year "+ year +"from dropdown list" + yearDropdown.toString());

        selectByValueFromDropDown(yearDropdown, year);
    }


    public void enterValueToEmailField(String email){
        Reporter.log("Enter email "+ password + "to email field " + emailField.toString());

        sendTextToElement(emailField, email);
    }
    public void enterValueToPasswordField(String password){
        Reporter.log("Enter password "+ password + "to password field " + passwordField.toString());

        sendTextToElement(passwordField, password);
    }
    public void enterValueToConfirmPasswordField(String confirmPassword){
        Reporter.log("Enter confirm password "+ password + "to password field " + confirmPasswordField.toString());

        sendTextToElement(confirmPasswordField, confirmPassword);
    }
    public String getValueOfRegistrationSuccessMessage(){
        String name = getTextFromElement(registrationSuccessMessage);
        Reporter.log("Get text from registration success message " + confirmPasswordField.toString());

        return name;
    }




}
