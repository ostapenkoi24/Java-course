package apium.runners;

import apium.BaseAppiumSteps;
import apium.config.AppiumDriverConfig;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/apium/features",
        glue = "apium.steps",
        tags = "@MainPageFeature",
        dryRun = false,
        strict = false,
        snippets = SnippetType.UNDERSCORE

)
 public class AppiumRunner {
    @BeforeClass
    public static void start() {

        BaseAppiumSteps.driver = AppiumDriverConfig.initAndroidChrome();
    }

    @AfterClass
    public static void end() {

        BaseAppiumSteps.driver.quit();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}


