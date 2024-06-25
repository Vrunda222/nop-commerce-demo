package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComputerSteps {
    @When("I click on computer link")
    public void iClickOnComputerLink() {
        new HomePage().clickOnMenuTab("Computers");
    }

    @And("I should navigate to computer page successfully")
    public void iShouldNavigateToComputerPageSuccessfully() {
    }

    @Then("I should see the computers text {string}")
    public void iShouldSeeTheComputersText(String text) {
        String actualText = new ComputerPage().getTextFromMenuPageTitle();
        Assert.assertEquals(actualText, text, "Page not redirected successfully");

    }

    @And("I click on desktops link")
    public void iClickOnDesktopsLink() {
        new ComputerPage().clickOnDesktopsLink();
    }

    @Then("I should see the desktops text {string}")
    public void iShouldSeeTheDesktopsText(String text) {
        String actualText = new DesktopsPage().getTextFromMenuPageTitle();
        Assert.assertEquals(actualText, text, "Page not redirected successfully");
    }

    @And("I click on product name Build your own computer")
    public void iClickOnProductNameBuildYourOwnComputer() {
        new DesktopsPage().clickOnProductName();
    }

    @And("I select processor {string}")
    public void iSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessorFromDropdown(processor);
    }

    @And("I Select RAM {string}")
    public void iSelectRAM(String ram) {
        new BuildYourOwnComputerPage().selectRamFromDropdown(ram);
    }

    @And("I Select HDD {string}")
    public void iSelectHDD(String hdd) {
        new BuildYourOwnComputerPage().clickOnHdd();
    }

    @And("I Select OS {string}")
    public void iSelectOS(String os) {
        new BuildYourOwnComputerPage().clickOnOs();
    }

    @And("I Select Software {string}")
    public void iSelectSoftware(String software) {
        new BuildYourOwnComputerPage().clickOnSoftwareCheckboxThree();
    }

    @And("I click on add to cart button")
    public void iClickOnAddToCartButton() {
        new BuildYourOwnComputerPage().clickOnAddToCart();
    }

    @Then("I should see product added success message {string}")
    public void iShouldSeeProductAddedSuccessMessage(String message) {
        String actualProductAddedText = new BuildYourOwnComputerPage().getTextFromProductAddSuccessMessage();
        Assert.assertEquals(actualProductAddedText, message, "{Product not added in cart}");
    }
}


