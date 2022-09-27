package pages;

import cucumber.CucumberBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class MainPage extends CucumberBase {
    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//p[@class=\"section-content_descriptor\"]")
    WebElement mTitle;
    @FindBy(xpath = "//ul[@class+\"block-course-cats_list\"]")
    WebElement blockCourseList;
    @FindBy(className = "section-content_logo")
    WebElement logoElement;
    @FindBy(id = "btn-consultation-hero")
    public WebElement button;
    @FindBy(xpath = "//li[contains(@class, '-blog')and contains(@class, 'site-nav-menu_item')]")
    WebElement blogButton;

    public boolean getLogoLink(String linkLogo) {
        return logoElement.getAttribute("xmlns").equals(linkLogo);
    }

    public String getButtonText() {
        return button.getText();
    }

    public void clickBlogButton() {
        blogButton.click();
    }
//        public void clickMenuByName(MenuList item){
//            List<WebElement> list=menuList.findElements(By.tagName("li"));
//            switch (item){
//                case BLOG:
//                    for (WebElement l:list){
//                        if (l.)
//                    }
//                    break;
//                case SCHOOL:
//                    break;
//                case COURSES:
//                    break;
//                case CONTACTS:
//                    break;
//            }


    public List<String> getCourseNameList() {
        By li = By.tagName("li");
        By label = By.tagName("course-cat-bar_label");
        List<String> stringList = new ArrayList<>();
        List<WebElement> list = blockCourseList.findElements(li);
        for (WebElement l : list) {
            try {
                stringList.add(l.findElement(label).getText());
            } catch (Exception ignore) {

            }
        }
        return stringList;
    }
    public String getMTitleText() {
        return mTitle.getText();
    }
}


