package cucumber.steps;

import cucumber.CucumberBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.CertificatePage;

import static java.lang.Thread.sleep;

public class CertificationSteps extends CucumberBase {
    CertificatePage certificatePage= PageFactory.initElements(driver,CertificatePage.class);

    @And("^Enter certificate code \"([^\"]*)\"$")
    public void enterCertificateCode(String cer) throws Throwable {
        certificatePage.getInformationAboutCertificate(cer);
        Thread.sleep(2000);
    }

    @Then("^Check result$")
    public void checkResult() throws InterruptedException {
        Assert.assertNotEquals(certificatePage.getMessage(),"Сертифікат не знайдено");

    }
}
