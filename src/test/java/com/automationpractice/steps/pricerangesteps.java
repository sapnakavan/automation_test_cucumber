package com.automationpractice.steps;

import com.automationpractice.pages.RangePage;
import com.automationpractice.pages.SummerDressPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class pricerangesteps {


    @And("^I select slider to change price$")
    public void iSelectSliderToChangePrice() throws InterruptedException {
        new RangePage().selectSliderPriceRange();
    }

    @Then("^I verify price range$")
    public void iVerifyPriceRange() {
        new RangePage().verifyPriceRange();
    }
}
