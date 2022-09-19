package com.automationpractice.steps;

import com.automationpractice.pages.DeletePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class deletesteps {
    @When("^I click on women link$")
    public void iClickOnWomenLink() {
        new DeletePage().clickOnWomen();
    }

    @And("^I click on fraded short$")
    public void iClickOnFradedShort() {
        new DeletePage().clickOnFadedShort();
    }

    @And("^I select add to cart$")
    public void iSelectAddToCart() throws InterruptedException {
        Thread.sleep(1000);
        new DeletePage().clickOnAddToCartButton();
    }

    @And("^I click on checkout$")
    public void iClickOnCheckout() {
        new DeletePage().clickOnCheckout();
    }

    @And("^I click on delete$")
    public void iClickOnDelete() {
        new DeletePage().clickOnDelete();
    }

    @Then("^I verify shopping cart empty$")
    public void iVerifyShoppingCartEmpty() {
        new DeletePage().getTextShoppingcartEmpty();
    }
}
