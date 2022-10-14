package driverConfig;

import net.lightbody.bmp.BrowserMobProxyServer;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BaseClass {
    protected static WebDriver driver;
    public static BrowserMobProxyServer server;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public static void iinit(){

        driver= DriverFactory.getDriver(BROWSER.CHROMEPROXY);
    }
    @AfterClass
    public static void clovse(){
        driver.close();
            if(server !=null){
            server.stop();
    }}

}

