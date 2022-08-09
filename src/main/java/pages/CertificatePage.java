package pages;

import cucumber.CucumberBase;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Util;


public class CertificatePage extends CucumberBase {
    @FindBy(xpath = "//*[@id=\"certificateCheckForm\"]/div/input")
    WebElement certificateField;

    @FindBy(xpath = "//button[contains(@class,'btn') and contains(@class, 'certificate-check_submit')]")
    WebElement buttonSubmit;

    @FindBy(xpath = "//p[@class='certificate-check_message']")
    WebElement messageField;

    public CertificatePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void getInformationAboutCertificate(String cert) {
        certificateField.sendKeys(cert);
        buttonSubmit.click();


    }

    public String getMessage(){
        try {
            Util.waitVisibilityOfElement(driver,messageField,5);
            return messageField.getText();
        }catch (TimeoutException ignore){
            return "Certificate exist";
        }
    }

}
