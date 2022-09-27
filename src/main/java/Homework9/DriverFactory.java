package Homework9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static WebDriver getDriver(BROWSER brows){
        WebDriver driver = null;
//        BROWSER browser = BROWSER.valueOf(brows);
        switch (brows){
            case CHROME:
                driver = initChrome();
                break;
            case FIREFOX:
                driver = initFirefox();
                break;

        }
        return driver;
    }
    private static WebDriver initFirefox(){

        return new FirefoxDriver();
    }
    private static WebDriver initChrome(){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return new ChromeDriver();
    }





}
