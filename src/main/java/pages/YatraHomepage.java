package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class YatraHomepage {
    WebDriver driver;
    String suggesionXpath = "//div[contains(text(),'value')]";
    By fromLoaction = By.xpath("//div[@role='Combobox' and contains(@aria-label,'Departure')]");
    By toLoaction = By.xpath("//div[@role='Combobox' and contains(@aria-label,'Going')]");

    By fromLocationInputbox = By.xpath("//input[contains(@class,'MuiInputBase-input MuiInput')]");

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
        driver.findElement(fromLocationInputbox).sendKeys(from);
        driver.findElement(By.xpath(suggesionXpath.replaceAll("value", from))).click();

        driver.findElement(toLoaction).click();
        driver.findElement(fromLocationInputbox).sendKeys(to);
        driver.findElement(By.xpath(suggesionXpath.replaceAll("value", to))).click();
    }


    public void gettheLowestPrice() throws InterruptedException {
        driver.findElement(By.xpath("(//div[contains(@class,'MuiAutocomplete-root MuiAutocomplete-hasClearIcon')])[1]/..")).click();
       Thread.sleep(5000);

        List<WebElement> rates = driver.findElements(By.xpath("//div[@class='react-datepicker__month-container'][1]//span[contains(@class,'custom-day-content ')]"));
        List<String> RatesText = new ArrayList<>();
        for (WebElement webElement : rates) {
            RatesText.add(webElement.getText());
        }
        Collections.sort(RatesText);
        System.out.println(RatesText);
        String datesXpath = "//span[contains(@class,'custom-day-content ')and text()='value']/parent::span";
        List<WebElement> dates = driver.findElements(By.xpath(datesXpath.replace("value", RatesText.get(0))));
        System.out.println(" The lowest price of flight is  " + RatesText.get(0) + "  on dates :  " + dates.get(0).getText());
    }
}
