package com.Indigo.pages;

import com.Indigo.utilities.BrowserUtils;
import com.Indigo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(css = "#txtUsername")
    public WebElement userNameInput;

    @FindBy(css = "#txtPassword")
    public WebElement passwordInput;

    @FindBy(css = "#submit")
    public WebElement submitBtn;

   public void login(String username, String password){
       userNameInput.sendKeys(username);
       passwordInput.sendKeys(password);
       BrowserUtils.waitFor(2);
       submitBtn.click();

   }
}
