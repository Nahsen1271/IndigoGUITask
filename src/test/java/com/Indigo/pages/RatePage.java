package com.Indigo.pages;

import com.Indigo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RatePage {
    public RatePage(){
        PageFactory.initElements(Driver.get(),this);
    }


    @FindBy(xpath = "(//*[contains(@class,'jqx-checkbox-default jqx-check')])[2]")
    public WebElement newRecordCheckBox;


    @FindBy(css = "#taxratebutton")
    public WebElement rateButton;

    @FindBy(xpath = "(//div[contains(@id,'contenttable')])[2]/div/div[2]/input")
    public WebElement codeBox;

    @FindBy(css = "[id$='DateFrom-input']")
    public WebElement dateFromBox;

    @FindBy(css = "[data-uid='TaxRate-DateTo']")
    public WebElement dateToBox;

    @FindBy(xpath = "//input[@data-uid='TaxRate-RangeFrom']")
    public WebElement rangeFrom;

    @FindBy(xpath = "//input[@data-uid='TaxRate-RangeTo']")
    public WebElement rangeTo;

    @FindBy(xpath = "//input[@data-uid='TaxRate-Rate']")
    public WebElement taxRate ;

    @FindBy(css= "[data-uid='TaxRate-Subtract']")
    public WebElement subtract;

    @FindBy(xpath = "//div[@role='checkbox']")
    public WebElement showAsPtCheckBox ;

    @FindBy(xpath = "(//div[@role='gridcell'])[5]")
    public WebElement existingRecordcheckBox ;

    @FindBy(css= "[data-uid='Tax Rate-editButton']")
    public WebElement editButton;

    @FindBy(xpath = "//*[@id='deleteActionButton']")
    public WebElement deleteButton ;

    @FindBy(xpath = "//button[normalize-space()='delete']")
    public WebElement deleteConfirmation ;

    @FindBy(css = "div.toast-message")
    public WebElement deletingPopup;

    @FindBy( css = ".qx-input-metro.qx-widget-content-metro.jqx-widget-content.jqx-input-widget.jqx-input.jqx-widget.jqx-rc-all.mandatory.warning")
    public List <WebElement> listOfCode;

    @FindBy( css = "jqx-grid-cell-left-align")
    public List <WebElement> listOfNewProfiles;

    public void assignDate(WebElement webElement,String day,String month,String year) {
        webElement.sendKeys(day);
        webElement.sendKeys(month);
        webElement.sendKeys(year, Keys.TAB);

    }
    public void assignRate(WebElement webElement,String str1,String str2) {
        webElement.sendKeys(str1, Keys.ARROW_RIGHT);
        webElement.sendKeys(str2);
        webElement.sendKeys(Keys.TAB);

    }
    public void listofCreatedItem(List<WebElement>webElements,String str){
        for (WebElement option:webElements){
            if(option.getText().equals(str)){
                Assert.assertEquals(option.getText(),str);

            }
        }
    }
    public WebElement findNewRecord(String str) {

        return Driver.get().findElement(By.xpath("//div[contains(text(),'"+str+"')]/parent::*/../div"));
    }


}
