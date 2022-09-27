import driverConfig.BROWSER;
import driverConfig.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.TestingPage;
import util.DataUserProvider;


public class Test {
    static final By SEARCH=By.id("btn-consultation-hero");
    static final String BASEURL="https://ithillel.ua/";
    static WebDriver driver = DriverFactory.getDriver(BROWSER.CHROME);
    static HomePage homePage = new HomePage(driver);

    static {
        driver.get(BASEURL);
    }
    public static void main(String[] args) throws Exception {



        homePage.courseButtonClick();
//        if(!driver.getTitle().equals("dfgdfg")){
//            throw new Exception("Not equals Title");
//        }
        System.out.println(driver.getTitle());

//        TestingPage testingPage = PageFactory.initElements(driver, TestingPage.class);
        TestingPage testingPage = new TestingPage(driver);
        testingPage.buttonClick();

        driver.findElement(By.id("input-name-consultation")).sendKeys(DataUserProvider.getName());


        try {
            Thread.sleep(5000);
        } catch (InterruptedException ignore) {

        }

        driver.quit();

    }


}
