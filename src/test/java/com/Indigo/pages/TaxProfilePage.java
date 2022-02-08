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

    @FindBy(xpath = "(//*[@data-context='TaxProfile'])[1]")
    public WebElement profileNameBox;

    @FindBy(css = "input[id$='Description-']")
    public WebElement profileDescriptionBox;

    @FindBy(xpath = "(//*[@data-context='TaxProfile'])[1]")
    public WebElement profileDescForClck;

    @FindBy(xpath = "(//div[text()='FSS Main'])[1]")
    public WebElement statusType;

    @FindBy(xpath = "//*[@role='option'][2]")
    public WebElement fssPartTimeBtn;

    @FindBy(css= ".jqx-checkbox-default.jqx-checkbox-default-metro.jqx-fill-state-normal.jqx-fill-state-normal-metro.jqx-rc-all.jqx-rc-all-metro.jqx-checkbox-rtl.jqx-checkbox-rtl-metro")
    public WebElement taxOnAnnualProjGrossCheckBox;

    @FindBy(xpath = "//div[@id='saveButton']")
    public WebElement saveButton;

}
