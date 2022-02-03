package com.Indigo.stepDefinitions;

import com.Indigo.pages.HomePage;
import com.Indigo.pages.LoginPage;
import com.Indigo.pages.TaxProfilePage;
import com.Indigo.utilities.ConfigurationReader;
import com.Indigo.utilities.Driver;
import io.cucumber.java.en.*;

public class HomeStepDef {

    HomePage homePage=new HomePage();
    TaxProfilePage taxProfilePage=new TaxProfilePage();
    LoginPage loginPage=new LoginPage();

    @Given("User can navigate to home page using {string} and {string}")
    public void user_can_navigate_to_home_page_using_and(String string, String string2) {
        loginPage.login(string,string2);
    }


        @Given("User is on the home page")
    public void user_is_on_the_home_page() {
        String expectedPageTitle="QATest01 - People Module";
        homePage.getPageTitle(expectedPageTitle,homePage.taxProfile);
    }

    @When("User clicks the Tax Profiles")
    public void user_clicks_the_Tax_Profiles() {
        homePage.taxProfile.click();
    }

    @Then("User can navigate to  Tax Profile Page")
    public void user_can_navigate_to_Tax_Profile_Page() {
        String expectedPageTitle="QATest01 - Tax Profiles";
        homePage.getPageTitle(expectedPageTitle,taxProfilePage.plusIcon);

    }
}
