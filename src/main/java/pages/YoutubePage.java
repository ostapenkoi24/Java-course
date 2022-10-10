package pages;

import driverConfig.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YoutubePage extends BaseClass {
    public YoutubePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "search-container")
    WebElement searchField;
    @FindBy(id="search-icon-legacy")
    WebElement searchButton;


    public WebElement clickSearchField(){

        searchField.click();
        searchButton.click();
    return null;
    }



    }

