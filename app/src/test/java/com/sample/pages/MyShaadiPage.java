package com.sample.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.sample.core.Driver;

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

    public void scrollToNewMatches(){

        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Members who joined recently\").instance(0))").click();
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
