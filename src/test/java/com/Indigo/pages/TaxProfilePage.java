package com.Indigo.pages;

import com.Indigo.utilities.BrowserUtils;
import com.Indigo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaxProfilePage {
    public TaxProfilePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(css = "#insertButton")
    public WebElement plusIcon;



//    public void getPageTitle(WebElement webElement){
//        String expectedPageTitle="QATest01 - People Module";
//        BrowserUtils.waitForClickablility(webElement,10);
//        String currentPageTitle= Driver.get().getTitle();
//        Assert.assertEquals(expectedPageTitle,currentPageTitle);
//    }

}
