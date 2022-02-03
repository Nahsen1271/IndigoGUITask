package com.Indigo.pages;

import com.Indigo.utilities.BrowserUtils;
import com.Indigo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(css = ".currentModuleSectionGroup-moduleText.fxStretch")
    public WebElement taxProfile;



    public void getPageTitle(String expectedPageTitle,WebElement webElement){

        BrowserUtils.waitForClickablility(webElement,10);
        String currentPageTitle= Driver.get().getTitle();
        Assert.assertEquals(expectedPageTitle,currentPageTitle);
    }
}
