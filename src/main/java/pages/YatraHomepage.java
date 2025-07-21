package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YatraHomepage {
    WebDriver driver;
    By fromLoaction=By.xpath("//div[@role='Combobox' and contains(@aria-label,'New')]");


    public YatraHomepage(WebDriver driver) {
        this.driver = driver;
    }


    public void userClickonTripType(String tripType) {
        String value = "//*[contains(text(), 'TripType')]/ancestor::*[@role='radio']";
        value = value.replaceAll("TripType", tripType);
        driver.findElement(By.xpath(value)).click();
    }


    public void userEntersFromAndToValues(String from, String to) {
        driver.findElement(fromLoaction).click();
    }


    
}
