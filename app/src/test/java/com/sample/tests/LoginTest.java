package com.sample.tests;

import com.sample.core.BaseSetup;
import com.sample.pages.LoginPage;
import com.sample.pages.MatchesPage;
import com.sample.pages.MyShaadiPage;
import com.sample.pages.SplashScreenPage;

import org.testng.annotations.Test;

public class LoginTest extends BaseSetup {

    @Test(priority = 1)
    public void testLogin()
    {
        {
            SplashScreenPage loginSplashPage = new SplashScreenPage();
            loginSplashPage.clickLogin();
            System.out.println("Clicked on login on Splash screen");
            LoginPage loginPage = new LoginPage();
            loginPage.validateLoginpage();
            loginPage.LoginWithCredentials();
        }

    }

    @Test(priority = 2)
    public void VerifyWidgets()
    {
        MyShaadiPage myShaadiPage = new MyShaadiPage();
        myShaadiPage.verifyPremiumMatches();
        myShaadiPage.verifyNewMatches();
    }


    @Test(priority = 3)
    public void Connect()
    {
        MatchesPage matchesPage = new MatchesPage();
        matchesPage.clickMyShaadi();
    }
}
