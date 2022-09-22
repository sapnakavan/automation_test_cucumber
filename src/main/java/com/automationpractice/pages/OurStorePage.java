package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OurStorePage extends Utility {
    private static final Logger log = LogManager.getLogger(OurStorePage.class.getName());

    public OurStorePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Our stores')]")
    WebElement ourstore;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'OK')]")
    WebElement okButton;
    @CacheLookup
    @FindBy(xpath = "//div[@id='map']")
    WebElement map;
    @CacheLookup
    @FindBy(xpath = "//button[@title='Zoom out']")
    WebElement zoomOut;

    public void clickOnOurStore() {
        clickOnElement(ourstore);
    }

    public void clickokpopup() {
        clickOnElement(okButton);
    }

    public void drag() {

        new Actions(driver).moveToElement(map, 0, 0).clickAndHold().moveByOffset(300, 0).release().build().perform();
        clickOnElement(zoomOut);
    }

    public void zoom1() {
        clickOnElement(zoomOut);
    }


    public void getScreenshot(){
        Utility.takeScreenShot();
    }
}




