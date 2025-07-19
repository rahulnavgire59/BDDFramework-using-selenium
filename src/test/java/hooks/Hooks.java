package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.DriverFactory;

public class Hooks {

    @Before
    public void setup(){
        System.out.println("In hooks Class");
         DriverFactory.getDriver();
//        driver.get("chrome://settings/clearBrowserData");


    }
@After
    public void teardown(){
        DriverFactory.quitDriver();
}


}
