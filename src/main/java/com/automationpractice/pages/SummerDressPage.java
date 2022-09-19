package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SummerDressPage extends Utility {
    private static final Logger log = LogManager.getLogger(SummerDressPage.class.getName());

    public SummerDressPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@title='Women']")
    WebElement mouseHoverToWomen;

    @CacheLookup
    @FindBy(linkText = "Summer Dresses")
    WebElement summerDress;

    @CacheLookup
    @FindBy(xpath = "//div[@class='rte']")
    WebElement summerDressPage;


    public void setMouseHoverToWomen() {
        mouseHoverToElement(mouseHoverToWomen);
    }

    public void clickOnSummerDress() {
        clickOnElement(summerDress);
    }

    public void verifyUserOnSummerDressPage() {
        String expectedmessage = getTextFromElement(summerDressPage);
        String actualmessage = "Short dress, long dress, silk dress, printed dress, you will find the perfect dress for summer.";
        Assert.assertEquals(expectedmessage, actualmessage);
    }
}
