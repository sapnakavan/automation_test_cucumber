package com.automationpractice.steps;

import com.automationpractice.pages.OurStorePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ourstoresteps {
    @When("^I click on our store$")
    public void iClickOnOurStore() {
        new OurStorePage().clickOnOurStore();
    }

    @And("^I clear popup mgs$")
    public void iClearPopupMgs() {
        new OurStorePage().clickokpopup();
    }

    @And("^I drag map$")
    public void iDragMap() {
        new OurStorePage().drag();
    }

    @And("^click on zoom$")
    public void clickOnZoom() {
        new OurStorePage().zoom1();
    }

    @Then("^I am able to take a screenshoot$")
    public void iAmAbleToTakeAScreenshoot() {
        new OurStorePage().getScreenshot();
    }
}
