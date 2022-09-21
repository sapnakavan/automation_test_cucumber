package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RangePage extends Utility {
    private static final Logger log = LogManager.getLogger(RangePage.class.getName());

    public RangePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//ul[@id='ul_layered_price_0']")
    WebElement sliderRange;

    @CacheLookup
    @FindBy(xpath = "//span[@id='layered_price_range']")
    WebElement priceText;

    public void selectSliderPriceRange() {
        System.out.println(sliderRange.getLocation());
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(sliderRange, -182, 0).perform();
    }

    public String verifyPriceRange() {
        return getTextFromElement(priceText);
    }

}
