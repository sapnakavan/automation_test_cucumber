package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeletePage extends Utility {
    private static final Logger log = LogManager.getLogger(DeletePage.class.getName());

    public DeletePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@title='Women']")
    WebElement womenbutton;

    @CacheLookup
    @FindBy(xpath = "//*[contains(text(),'Faded Short Sleeve T-shirts')]")
    WebElement fadedShort;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(xpath = "//a[@class='btn btn-default button button-medium']")
    WebElement checkout;
    @CacheLookup
    @FindBy(xpath = "//i[@class='icon-trash']")
    WebElement delete;
    @CacheLookup
    @FindBy(xpath = "//p[@class='alert alert-warning']")
    WebElement verifyText;


    public void clickOnWomen() {
        clickOnElement(womenbutton);
    }

    public void clickOnFadedShort() {
        clickOnElement(fadedShort);
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    public void clickOnCheckout() {
        clickOnElement(checkout);

    }

    public void clickOnDelete() {
        clickOnElement(delete);
    }

    public String getTextShoppingcartEmpty() {
        return getTextFromElement(verifyText);

    }

}
