package com.sample.pages;

import com.sample.core.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MatchesPage {

    MatchesPage.PageObjects matchesPage;

    public MatchesPage() {
        super();
        matchesPage = new PageObjects();
        PageFactory.initElements(driver, matchesPage);
    }

    public void clickMyShaadi() {
        matchesPage.myShaadi.click();

    }


    class PageObjects {
        @CacheLookup
        @FindBy(name = "My Shaadi")
        public WebElement myShaadi;

    }
}
