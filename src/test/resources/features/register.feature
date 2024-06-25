
Feature: Register Feature
  In Order to perform successful registration
  As a User
  I have to enter all mandatory fields

    #1. verifyUserShouldNavigateToRegisterPageSuccessfully
    #Click on Register Link
    #Verify "Register" text

  @sanity @smoke @regression
  Scenario: User should navigate to register page successfully
    Given I am on homepage
    When I click on register link
    And I should navigate to register page successfully
    Then I should see register text "Register"


    #2. verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory
    #Click on Register Link
    #Click on "REGISTER" button
    #Verify the error message "First name is required."
    #Verify the error message "Last name is required."
    #Verify the error message "Email is required."
    #Verify the error message "Password is required."
    #Verify the error message "Password is required."

  @smoke @regression
  Scenario: User should see FirstName, LastName, Email, Password and ConfirmPassword fields are mandatory with error message
    Given I am on homepage
    When I click on register link
    And I should navigate to register page successfully
    And I click on register button
    And I see error message for first name "First name is required."
    And I see error message for last name "Last name is required."
    And I see error message for email "Email is required."
    And I see error message for password "Password is required."
    Then I see error message for confirm password "Password is required."

    #3. verifyThatUserShouldCreateAccountSuccessfully
    #Click on Register Link
    #Select gender "Female"
    #Enter firstname
    #Enter lastname
    #Select day
    #Select month
    #Select year
    #Enter email
    #Enter password
    #Enter Confirm Password
    #Click on "REGISTER" button
    #Verify message "Your registration completed"

  @regression
  Scenario: User should create account successfully
    Given I am on homepage
    When I click on register link
    And I select gender female
    And I enter first name "abc"
    And I enter last name "xyz"
    And I select day "22"
    And I select month "2"
    And I select year "2023"
    And I enter email for registration "abcde@gmail.com"
    And I enter password for registration "1234567"
    And I enter confirm password for registration "1234567"
    And I click on register button
    Then I see registration success message "Your registration completed"