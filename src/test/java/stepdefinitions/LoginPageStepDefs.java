package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.Loginpage;
import utils.DriverFactory;

public class LoginPageStepDefs {
    WebDriver driver;
    Loginpage loginpage;

    @Given("the user is on Login page")
    public void the_user_is_on_login_page() {
       driver= DriverFactory.getDriver();
       loginpage = new Loginpage(driver);
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }
    @When("the user enters {string}")
    public void the_user_enters(String uname) throws InterruptedException {
        Thread.sleep(5000);
       loginpage.enterUsername(uname);
    }
    @When("user enters the {string}")
    public void user_enters_the(String pass) {
        loginpage.enterPassword(pass);
    }
    @Then("the user clicks on login Button")
    public void the_user_clicks_on_login_button() {
        loginpage.clickLogin();
    }



}
