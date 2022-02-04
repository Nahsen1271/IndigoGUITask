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
        ratePage.newRecordCheckBox.click();
        BrowserUtils.waitFor(1);
        ratePage.rateButton.click();
        BrowserUtils.waitFor(1);

    }

    @And("User can create a new rate")
    public void userCanCreateANewRate() {
        taxProfilePage.plusIcon.click();
        BrowserUtils.waitFor(5);
        ratePage.codeBox.click();
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




//        System.out.println("dropdownOptions.size() = " + dropdownOptions.size());
//
//        Assert.assertEquals(dropdownOptions.size(),5,"verify size of options");
//
//        for (WebElement option : dropdownOptions) {
//
//            System.out.println("option.getText() = " + option.getText());
//
//        }
//        dropdownOptions.get(2).click();
//        actualRateCode=ratePage.codeBox;
//        System.out.println("actualRateCode = " + actualRateCode);
//        String expectedRateCode="1271CNF";
//        Assert.assertEquals(expectedRateCode,actualRateCode);

    }

}
