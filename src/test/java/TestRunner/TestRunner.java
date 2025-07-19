package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/resources/features"},
        glue = {"stepdefinitions","hooks"},
        plugin = {"pretty","html:target/cucumber-reports.html"},
        monochrome = true
)


public class TestRunner extends AbstractTestNGCucumberTests {
}
