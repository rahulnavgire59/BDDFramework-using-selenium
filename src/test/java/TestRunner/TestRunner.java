package TestRunner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"stepdefinitions","hooks"},
        plugin = {"pretty","html:target/cucumber-reports.html"},
        monochrome = true
)


public class TestRunner {
}
