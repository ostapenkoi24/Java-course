package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class JavaBasic {
    private static WebDriver driver;



    public JavaBasic(WebDriver driver){

        this.driver=driver;
    }

    public String getCourseTitle() {
        return  driver.findElement(By.className("course-descriptor_header-text")).getText();


    }

    public String getCourseRate(){
        return driver.findElement(By.className("course-rating")).getText();

    }

    public String getCourseDescription(){
        return driver.findElement(By.className("programme-h_title")).getText();

    }
}


