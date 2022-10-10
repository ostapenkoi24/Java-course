import driverConfig.BaseClass;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import pages.BlogPage;
import pages.MainPage;
import util.WatcherByClassTest;

public class Homework12 extends BaseClass {
    @Rule
    public WatcherByClassTest watcherByClassTest= new WatcherByClassTest();
    private static final String MAIN_URL = "https://ithillel.ua/";

    private static MainPage mainPage;
    private static BlogPage blogPage;
    @BeforeClass
    public static void before(){
        driver.get(MAIN_URL);
        mainPage= new MainPage(driver);
    }

    @Test
    public void testBlog(){

        mainPage.clickBlogButton();
        Assert.assertEquals(driver.getTitle(), "Корисні матеріали: Статті та новини IT-індустрії | Комп'ютерна школа Hillel");
        blogPage=new BlogPage(driver);

    }
    @Test
    public void testFrontEnd(){

        blogPage.clickBlogMenu("frontend");
        System.out.println("Front-End = " + blogPage.getListNewsSize());
        driver.navigate().back();

    }
    @Test
    public void testQa(){

        blogPage.clickBlogMenu("qa");
        System.out.println("QA = " + blogPage.getListNewsSize());
        driver.navigate().back();

    }
    @Test
    @DisplayName("TestPM")
    public void testPm(){

        blogPage.clickBlogMenu("management");
        System.out.println("PM = " + blogPage.getListNewsSize());
        driver.navigate().back();
    }
    @Test
    @DisplayName("TestMarketing")
    public void testMarketing(){

        blogPage.clickBlogMenu("marketing");
        System.out.println("Marketing = " + blogPage.getListNewsSize());
        Assert.assertEquals("RRR",blogPage.getListNewsSize());
        driver.navigate().back();

    }

}
