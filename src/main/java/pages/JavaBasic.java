package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class JavaBasic {
    private static WebDriver driver;



    public JavaBasic(WebDriver driver){

        this.driver=driver;
    }

    public void getCourseTitle() {
        System.out.println((driver.findElement(By.className("course-descriptor_header-text")).getText()));



    }

    public void getCourseRate(){
        System.out.println(driver.findElement(By.className("course-rating")).getText());

    }

    public void getCourseDescription(){
        System.out.println(driver.findElement(By.className("programme-h_title")).getText());

    }
}


