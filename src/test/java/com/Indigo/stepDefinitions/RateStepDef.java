package com.Indigo.stepDefinitions;

import com.Indigo.pages.RatePage;
import com.Indigo.pages.TaxProfilePage;
import com.Indigo.utilities.BrowserUtils;
import com.Indigo.utilities.ConfigurationReader;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;



public class RateStepDef {

     RatePage ratePage=new RatePage();
     TaxProfilePage taxProfilePage=new TaxProfilePage();

    @Given("User can navigate to the rate page")
    public void userCanNavigateToTheRatePage() {
        BrowserUtils.waitFor(3);
        //ratePage.newRecordCheckBox.click();
        ratePage.findNewRecord(ConfigurationReader.get("name")).click();
        BrowserUtils.waitFor(2);
        ratePage.rateButton.click();
        BrowserUtils.waitFor(1);

    }

    @And("User can create a new rate")
    public void userCanCreateANewRate() {
        taxProfilePage.plusIcon.click();
        BrowserUtils.waitFor(5);
        ratePage.codeBox.sendKeys(ConfigurationReader.get("code"), Keys.TAB);

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

    ratePage.listofCreatedItem(ratePage.listOfCode,ConfigurationReader.get("code"));

    }

    @When("User can edit new changes")
    public void userCanEditNewChanges() {
        BrowserUtils.waitFor(1);
        ratePage.newRecordCheckBox.click();
        BrowserUtils.waitFor(1);
        ratePage.rateButton.click();
        BrowserUtils.waitFor(1);
        ratePage.existingRecordcheckBox.click();
        BrowserUtils.waitFor(1);
        ratePage.editButton.click();
        BrowserUtils.waitFor(1);
        ratePage.assignDate(ratePage.dateFromBox,"02","02","2020");
        BrowserUtils.waitFor(1);
        ratePage.assignDate(ratePage.dateToBox,"03","05","2022");
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

    @When("User can delete the profile")
    public void userCanDeleteTheProfile() {
        BrowserUtils.waitFor(1);
        ratePage.findNewRecord(ConfigurationReader.get("name")).click();
        BrowserUtils.waitFor(1);
        ratePage.existingRecordcheckBox.click();
        BrowserUtils.waitFor(1);
        ratePage.deleteButton.click();
        BrowserUtils.waitFor(1);
        BrowserUtils.waitForClickablility(ratePage.deleteConfirmation,10);
        ratePage.deleteConfirmation.click();

    }

    @Then("User checks if it is deleted")
    public void userChecksIfItIsDeleted() {
        BrowserUtils.waitFor(1);
        Assert.assertTrue(ratePage.deletingPopup.isDisplayed());
    }
}
