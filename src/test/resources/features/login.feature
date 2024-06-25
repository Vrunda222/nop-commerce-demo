
Feature: Login Feature
  In Order to perform successful login
  As a User
  I have to enter correct username and password

  #1.userShouldNavigateToLoginPageSuccessFully.
  #Click on login link
  #verify that "Welcome, Please Sign In!" message display

  @sanity @smoke @regression
  Scenario: User should navigate to login page successfully
    Given I am on homepage
    When I click on login link
    And I should navigate to login page successfully
    Then I should see the welcome message "Welcome, Please Sign In!"


    #2. verifyTheErrorMessageWithInValidCredentials.
    #Click on login link
    #Enter EmailId
    #Enter Password
    #Click on Login Button
    #Verify that the Error message

  @smoke @regression
  Scenario: Verify the error message with invalid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "Prime@gmail.com"
    And I enter password "12345"
    And I click on login button
    Then I should see the error message "Login was unsuccessful. Please correct the errors and try again./n No customer account found"


    #3. verifyThatUserShouldLogInSuccessFullyWithValidCredentials.
    #Click on login link
    #Enter EmailId
    #Enter Password
    #Click on Login Button
    #Verify that LogOut link is display

  @regression
  Scenario: User should login successfully with valid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "abc@gmail.com"
    And I enter password "12345678"
    And I click on login button
    And I should login successfully
    Then I should see logout link

    #4. VerifyThatUserShouldLogOutSuccessFully
    #Click on login link
    #Enter EmailId
    #Enter Password
    #Click on Login Button
    #Click on LogOut Link
    #Verify that LogIn Link Display

  @regression
  Scenario: User should logout successfully
    Given I am on homepage
    When I click on login link
    And I enter email "abc@gmail.com"
    And I enter password "12345678"
    And I click on login button
    And I should login successfully
    And I click on logout link
    Then I should see login link




