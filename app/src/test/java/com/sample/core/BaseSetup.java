package com.sample.core;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseSetup {
    private DesiredCapabilities capabilities = new DesiredCapabilities();
    private static AndroidDriver androidDriver = null;

    private String appiumPort = "4723";
    private String serverIp = "0.0.0.0";

    @BeforeClass
    public void setup(){
        initDriver();
    }

    public AndroidDriver getDriver() {
        return androidDriver;
    }

    private void initDriver(){
        System.out.println("Inside initDriver method");

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName", "Android");
        cap.setCapability("deviceName", "Pixel2");
        cap.setCapability("appPackage", "com.shaadi.android");
        cap.setCapability("appActivity","com.shaadi.android.ui.achivement_splash.AchievementSplashActivity");
        cap.setCapability("noReset", true);
        String serverUrl = "http://" + serverIp + ":" + appiumPort + "/wd/hub";


        try
        {
            System.out.println("Argument to driver object : " + serverUrl);
            androidDriver = new AndroidDriver(new URL(serverUrl), capabilities);

        }
        catch (NullPointerException | MalformedURLException ex) {
            throw new RuntimeException("appium driver could not be initialised for device ");
        }
        System.out.println("Driver in initdriver is : "+androidDriver);

    }

    @AfterClass
    public void tearDown(){
        androidDriver.quit();
    }

}
