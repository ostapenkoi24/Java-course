package cucumber.steps;

import cucumber.CucumberBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.CertificatePage;

public class CertificationSteps extends CucumberBase {
    CertificatePage certificatePage= PageFactory.initElements(driver,CertificatePage.class);
    @And("^Enter certificate code {string}")
    public void enterCertificateCode(String cer) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        certificatePage.getInformationAboutCertificate(cer);
        Thread.sleep(2000);
    }

    @Then("^Check result$")
    public void checkResult() throws InterruptedException{
        Assert.assertNotEquals(certificatePage.getMessage(),"Сертифікат не знайдено");

    }
}
