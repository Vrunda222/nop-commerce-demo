package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {


    //computer Text
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Computers']")
    WebElement computersText;

    //desktop link
    @CacheLookup
    @FindBy(xpath = "//li[@class='inactive']//a[normalize-space()='Desktops']")
    WebElement desktopsLink;



    public String getTextFromMenuPageTitle(){
        String name = getTextFromElement(computersText);

        return name;
    }

    public void clickOnDesktopsLink(){
        clickOnElement(desktopsLink);

    }
}
