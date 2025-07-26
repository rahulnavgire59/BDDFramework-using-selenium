package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.YatraHomepage;
import utils.DriverFactory;

public class YatraHompageStepDef {

    WebDriver driver;
    YatraHomepage yatraHomepage;

    @Given("the user loges in to the Yatra.com")
    public void the_user_loges_in_to_the_yatra_com() {
        driver = DriverFactory.getDriver();
        driver.get("https://www.yatra.com/react-home");
        yatraHomepage =new YatraHomepage(driver);
    }

    @When("user clicks selects {string}")
    public void user_clicks_selects(String TripType) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        yatraHomepage.userClickonTripType(TripType);
    }

    @When("user selects {string} and {string} destinations")
    public void user_selects_and_destinations(String from, String to) {
        yatraHomepage.userEntersFromAndToValues(from,to);
    }
    @Then("find the Lowest price in curent months.")
    public void find_the_lowest_price_in_curent_months() throws InterruptedException {
            yatraHomepage.gettheLowestPrice();

    }


}
