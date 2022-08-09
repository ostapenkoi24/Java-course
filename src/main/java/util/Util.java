package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Util {
    public static void waitVisibilityOfElement(WebDriver driver, WebElement element, int seconds){
        WebDriverWait webDriverWait=new WebDriverWait(driver, Duration.ofSeconds(seconds));
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }
}
