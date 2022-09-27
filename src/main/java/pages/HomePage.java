package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {

    private static WebDriver driver;

    By courseList = By.className("block-course-cats_item");

    public HomePage(WebDriver driver) {

        this.driver=driver;
    }

    public void courseButtonClick(){
        List<WebElement> listCourses = driver.findElements(courseList);
        for (WebElement element:listCourses){
            String atrHref = element.findElement(By.tagName("a")).getAttribute("href");
            if (atrHref.contains("testing")){
                element.click();
                break;
            }
        }
     }
}
