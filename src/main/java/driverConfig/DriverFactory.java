package driverConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static WebDriver getDriver(BROWSER browser){
        WebDriver driver = null;
//        BROWSER browser = BROWSER.valueOf(brows);
        switch (browser){
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

        ChromeOptions options = new ChromeOptions();
        options.addArguments( "--start-maximized" );
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

}
