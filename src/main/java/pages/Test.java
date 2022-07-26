package pages;

import driverConfig.DriverFactory;
import org.openqa.selenium.WebDriver;

public class Test {
    static final String BASEURL="https://ithillel.ua/courses/java-basic";
    static WebDriver driver = DriverFactory.getDriver("CHROME");

    static {
        driver.get(BASEURL);
    }
    static JavaBasic javaBasic = new JavaBasic(driver);

    public static void main(String[] args) {
        System.out.println(javaBasic.getCourseTitle());

        System.out.println(javaBasic.getCourseRate());
        System.out.println(javaBasic.getCourseDescription());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException ignore) {

        }

        driver.quit();


    }
}
