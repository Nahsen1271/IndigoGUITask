package com.Indigo.stepDefinitions;

import com.Indigo.pages.RatePage;
import com.Indigo.pages.TaxProfilePage;
import com.Indigo.utilities.BrowserUtils;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


public class RateStepDef {

     RatePage ratePage=new RatePage();
     TaxProfilePage taxProfilePage=new TaxProfilePage();

    @Given("User can navigate to the rate page")
    public void userCanNavigateToTheRatePage() {
        BrowserUtils.waitFor(3);
       // ratePage.newRecordCheckBox.click();
        ratePage.findRecord("Nahsen").click();
        BrowserUtils.waitFor(1);
        ratePage.rateButton.click();
        BrowserUtils.waitFor(1);

    }

    @And("User can create a new rate")
    public void userCanCreateANewRate() {
        taxProfilePage.plusIcon.click();
        BrowserUtils.waitFor(5);
       // ratePage.codeBox.click();
        ratePage.codeBox.sendKeys("1271CNF", Keys.TAB);

        BrowserUtils.waitFor(3);
        ratePage.assignDate(ratePage.dateFromBox,"11","01","2020");

        BrowserUtils.waitFor(1);
        ratePage.assignDate(ratePage.dateToBox,"02","03","2022");

        BrowserUtils.waitFor(1);
        ratePage.assignRate(ratePage.rangeFrom,"01","03");

        BrowserUtils.waitFor(1);
        ratePage.assignRate(ratePage.rangeTo,"11","02");

        BrowserUtils.waitFor(1);
        ratePage.assignRate(ratePage.taxRate,"05","05");

        BrowserUtils.waitFor(1);
        ratePage.assignRate(ratePage.subtract,"02","01");

        BrowserUtils.waitFor(1);
        ratePage.showAsPtCheckBox.click();
    }

    @Then("User checks if there is a new rate")
    public void userChecksIfThereIsANewRate() {

    ratePage.listofCreatedItem(ratePage.senden,"1271CNF");

    }

    @When("User can edit new changes")
    public void userCanEditNewChanges() {
        ratePage.newRecordCheckBox.click();
        ratePage.editButton.click();
        ratePage.assignDate(ratePage.dateFromBox,"02","02","2020");
        ratePage.assignDate(ratePage.dateFromBox,"03","05","2022");
        ratePage.assignRate(ratePage.rangeFrom,"01","03");
        ratePage.assignRate(ratePage.rangeTo,"11","02");
        ratePage.assignRate(ratePage.taxRate,"05","05");
        ratePage.assignRate(ratePage.subtract,"02","01");
        ratePage.showAsPtCheckBox.click();
    }

    @When("User can delete the profile")
    public void userCanDeleteTheProfile() {
        ratePage.deleteButton.click();
        BrowserUtils.waitForClickablility(ratePage.deleteConfirmation,10);
        ratePage.deleteConfirmation.click();

    }

    @Then("User checks if it is deleted")
    public void userChecksIfItIsDeleted() {



    }
}
