package com.sample.pages;

import com.sample.core.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyShaadiPage {

    PageObjects myShaadiPage;

    public MyShaadiPage() {
        super();
        myShaadiPage = new PageObjects();
        PageFactory.initElements(driver, myShaadiPage);
    }

    public void verifyPremiumMatches() {
        if (myShaadiPage.PremiumMatchesWidgetText.isDisplayed())
        {
            System.out.println("Premium Widget is present");
        }
    }

    public void verifyNewMatches(){

        if (myShaadiPage.NewMatchesWidgetText.isDisplayed())
        {
            System.out.println("New Widget is present");
        }
    }


    class PageObjects {
        @CacheLookup
        @FindBy(name = "Recently upgraded Premium members")
        public WebElement PremiumMatchesWidgetText;


        @CacheLookup
        @FindBy(name = "Members who joined recently")
        public WebElement NewMatchesWidgetText;


        @CacheLookup
        @FindBy(xpath = "")
        public WebElement ConnectNowPremiumMatches;


        @CacheLookup
        @FindBy(xpath = "")
        public WebElement ConnectNowNewMatches;
    }
}
