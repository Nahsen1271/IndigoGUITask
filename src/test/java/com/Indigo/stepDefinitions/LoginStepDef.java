package com.Indigo.stepDefinitions;

import com.Indigo.pages.HomePage;
import com.Indigo.pages.LoginPage;
import com.Indigo.utilities.BrowserUtils;
import com.Indigo.utilities.ConfigurationReader;
import com.Indigo.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginStepDef {
    HomePage homePage=new HomePage();
    LoginPage loginPage=new LoginPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));

    }

    @When("User types the credential {string} and {string}")
    public void user_types_the_credential_and(String string, String string2) {
        loginPage.login(string,string2);
    }

    @Then("User can login")
    public void user_can_login() {
        String expectedPageTitle="QATest01 - People Module";
        homePage.getPageTitle(expectedPageTitle,homePage.taxProfile);

    }

}
