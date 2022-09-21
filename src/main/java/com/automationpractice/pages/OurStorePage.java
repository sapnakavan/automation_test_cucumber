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

    public void scrollMapToSeeWestPalmBeach(){

       mouseHoverToElement(map);
        Actions actions = new Actions(driver);
        Action movement = actions.moveToElement(map)
                .clickAndHold()
                .moveToElement(map, -100, -670)
                .release(map)
                .build();
        movement.perform();
    }

    public void scrollPageDown() {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 500);");
    }

    public void takeScreenshot(){
        takeScreenShot("OurStores Screenshot");
    }
}





