package com.sample.pages;

import com.sample.core.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends Driver {

    PageObjects loginPage;

    String userName = "7021090096";
    String passWord = "Amogh123";

    public LoginPage() {
        super();
        loginPage = new PageObjects();
        PageFactory.initElements(driver, loginPage);
    }

    public boolean validateLoginpage(){
        boolean elements = false;
        if(loginPage.userNameFld.isDisplayed()){
            if(loginPage.passwordField.isDisplayed()){
                    if(loginPage.loginBtn.isDisplayed()){
                        elements = true;
                    }
                }
            }

        else{
            elements = false;
        }
        return elements;


    }

    public void LoginWithCredentials() {
        loginPage.userNameFld.sendKeys(userName);
        loginPage.passwordField.sendKeys(passWord);
        loginPage.loginBtn.click();

    }


    class PageObjects {

        @CacheLookup
        @FindBy(name = "Mobile No. / Email ID")
        public WebElement userNameFld;

        @CacheLookup
        @FindBy(name = "Password")
        public WebElement passwordField;

        @CacheLookup
        @FindBy(id = "com.shaadi.android:id/btn_login")
        public WebElement loginBtn;

    }
}
