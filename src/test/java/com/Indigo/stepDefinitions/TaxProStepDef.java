package com.Indigo.stepDefinitions;

import com.Indigo.pages.RatePage;
import com.Indigo.pages.TaxProfilePage;
import com.Indigo.utilities.BrowserUtils;
import com.Indigo.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;


public class TaxProStepDef {

    TaxProfilePage taxProfilePage=new TaxProfilePage();
    RatePage ratePage=new RatePage();

    @When("User can click plus button")
    public void userCanClickPlusButton() {
        taxProfilePage.plusIcon.click();
    }

    @And("User can create a new profile")
    public void userCanCreateANewProfile() {
        BrowserUtils.waitFor(3);
        taxProfilePage.profileNameBox.sendKeys("Aahmet", Keys.TAB);


        Driver.get().findElement(By.xpath("(//*[@data-context='TaxProfile'])[2]")).click();
        BrowserUtils.waitFor(2);
        String words = "return document.querySelector(\"[id$='Description-']\").value='Tester1271'";
        BrowserUtils.executeJScommand(words);
        BrowserUtils.waitFor(3);
        BrowserUtils.doubleClick(taxProfilePage.statusType);
        BrowserUtils.waitFor(2);
        taxProfilePage.fssPartTimeBtn.click();
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(taxProfilePage.taxOnAnnualProjGrossCheckBox);

    }
    @And("User can save the new input")
    public void userCanSaveTheNewInput() {
        taxProfilePage.saveButton.click();
    }

    @And("User check if there is a new profile")
    public void userCheckIfThereIsANewProfile() {

        ratePage.listofCreatedItem(ratePage.listOfNewProfiles,"Aahmet");

        }
}

