package com.automationpractice.steps;

import com.automationpractice.pages.SummerDressPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class summerdresssteps {
    @When("^I mouse hover to Women$")
    public void iMouseHoverToWomen() {
        new SummerDressPage().setMouseHoverToWomen();
    }

    @And("^I click on Summer Dresses$")
    public void iClickOnSummerDresses() {
        new SummerDressPage().clickOnSummerDress();
    }

    @And("^I am on summer dress page$")
    public void iAmOnSummerDressPage() {
        new SummerDressPage().verifyUserOnSummerDressPage();
    }
}
