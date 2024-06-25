
Feature: Computer Page Feature
  In Order to perform Product add successfully in cart
  As a User
  I have to add product in cart

  #1. verifyUserShouldNavigateToComputerPageSuccessfully
  #Click on Computer tab
  #Verify "Computers" text

  @sanity @smoke @regression
  Scenario: User should navigate to computer page successfully
    Given I am on homepage
    When I click on computer link
    And I should navigate to computer page successfully
    Then I should see the computers text "Computers"


  #2. verifyUserShouldNavigateToDesktopsPageSuccessfully
  #Click on Computer tab
  #Click on Desktops link
  #Verify "Desktops" text

  @smoke @regression
  Scenario: User should navigate to computer page successfully
    Given I am on homepage
    When I click on computer link
    And I should navigate to computer page successfully
    And I click on desktops link
    Then I should see the desktops text "Desktops"


  #3. verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully
  #Click on Computer tab
  #Click on Desktops link
  #Click on product name "Build your own computer"
  #Select processor "processor"
  #Select RAM "ram"
  #Select HDD "hdd"
  #Select OS "os"
  #Select Software "software"
  #Click on "ADD TO CART" Button
  #Verify message "The product has been added to your shopping cart"

  @regression
  Scenario Outline: User should navigate to computer page successfully
    Given I am on homepage
    When I click on computer link
    And I should navigate to computer page successfully
    And I click on desktops link
    And I click on product name Build your own computer
    And I select processor "<processor>"
    And I Select RAM "<ram>"
    And I Select HDD "<hdd>"
    And I Select OS "<os>"
    And I Select Software "<software>"
    And I click on add to cart button
    Then I should see product added success message "The product has been added to your shopping cart"

    Examples:
      | processor                                       | ram           | hdd               | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | VistaHome [+$50.00]     | Total Commander [+$5.00]   |