package Homework9;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Test {
    static final By SEARCH=By.id("btn-consultation-hero");
    static final String BASEURL="https://ithillel.ua/courses/qa-automation-kiev";

    public static void main(String[] args) {

        WebDriver driver = DriverFactory.getDriver(BROWSER.CHROME);
        driver.get(BASEURL);
        WebElement element = driver.findElement(SEARCH);
        System.out.println(driver.getTitle());
        System.out.println(element.isDisplayed());
        driver.quit();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


}
