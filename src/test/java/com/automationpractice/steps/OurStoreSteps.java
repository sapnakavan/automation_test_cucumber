package com.automationpractice.steps;

import com.automationpractice.pages.OurStorePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OurStoreSteps {

    @When("^User accepts the alert$")
    public void userAcceptsTheAlert() {
        new OurStorePage().clickokpopup();
    }

    @And("^moves the map to be able to view a store from West Palm Beach$")
    public void movesTheMapToBeAbleToViewAStoreFromWestPalmBeach() {
        new OurStorePage().scrollMapToSeeWestPalmBeach();
    }

    @And("^scrolls the map for a clear view$")
    public void scrollsTheMapForAClearView() {
        new OurStorePage().scrollPageDown();
    }

    @Then("^takes a screenshot for future reference$")
    public void takesAScreenshotForFutureReference() {
        new OurStorePage().takeScreenshot();
    }

    @Given("^User clicks on the link from the homepage Our Stores$")
    public void userClicksOnTheLinkFromTheHomepageOurStores() {
        new OurStorePage().clickOnOurStore();
    }
}
