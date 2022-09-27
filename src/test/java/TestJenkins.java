import driverConfig.BROWSER;
import driverConfig.DriverFactory;
import org.openqa.selenium.WebDriver;
import pages.JavaBasic;

public class TestJenkins {
    static final String BASEURL="https://ithillel.ua/courses/java-basic";
    static WebDriver driver = DriverFactory.getDriver(BROWSER.CHROME);

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
