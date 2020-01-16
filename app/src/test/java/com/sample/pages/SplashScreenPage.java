package com.sample.pages;

import com.sample.core.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SplashScreenPage extends Driver {

    PageObjects loginSplashPage;

    public SplashScreenPage() {
        super();
        loginSplashPage = new PageObjects();
        PageFactory.initElements(driver, loginSplashPage);
    }

    public void clickLogin() {
        loginSplashPage.loginBtn.click();

    }


    class PageObjects {
        @CacheLookup
        @FindBy(name = "Login")
        public WebElement loginBtn;

    }
}
