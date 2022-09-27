package cucumber.steps;


import cucumber.CucumberBase;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.MainPage;

public class MainPageSteps extends CucumberBase {
    static MainPage mainPage = null;
    static final String mainURL = "https://dnipro.ithillel.ua/";

//    @When("^I open site \"([^\"]*)\"$")

//        public void iOpenSite (String siteURL) throws Throwable {
//           driver.get(siteURL);
//            switch (siteURL) {
//                case mainURL:
//                    mainPage = new MainPage(driver);
//                    break;
//            }
//        }
//
//        @Then("^Text description button must equals \"([^\"]*)\"$")
//            public void textDescriptionButtonMustEquals (String mExTitle) throws Throwable {
//                Assert.assertEquals(mainPage.getMTitleText(), mExTitle);
//            }

    @When("I open site \\\"([^\\\"]*)\\\"$")
    public void iOpenSite(String siteURL) throws Throwable{
        driver.get(siteURL);
        switch (siteURL) {
            case mainURL:
                mainPage = new MainPage(driver);
                break;
        }
    }

    @Then("Text description must be equals {string}")
    public void textDescriptionMustBeEquals(String mExTitle) throws Throwable {
        Assert.assertEquals(mainPage.getMTitleText(), mExTitle);
    }
}



