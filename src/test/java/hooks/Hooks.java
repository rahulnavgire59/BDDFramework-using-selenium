package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverFactory;

public class Hooks {

    @Before
    public void setup(){
        System.out.println("In hooks Class");
        DriverFactory.getDriver();

    }
@After
    public void teardown(){
        DriverFactory.quitDriver();
}


}
