import driverConfig.BaseClass;
import models.AGENTS;
import models.UserAgents;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.WatcherByClassTest;

import java.util.concurrent.TimeUnit;

public class HomeWork21 extends BaseClass {
    @Rule
    public WatcherByClassTest watcherByClassTest= new WatcherByClassTest();

    @BeforeClass
    public static void before(){
        AGENTS.AgentType(UserAgents.SETUSERRU);
        driver.get("https://www.youtube.com/");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @Test
    public void youTubeScreen(){
        AGENTS.AgentType(UserAgents.IPHONE);
        driver.get("https://www.youtube.com/");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement element;
        element = driver.findElement(By.name("search_query"));


                element.sendKeys("no war");
                element.submit();
                //        driver.findElement(By.id("search-icon-legacy")).click();




    }
    @AfterClass
    public static void endAfter(){
        driver.close();
        server.stop();
    }


}
