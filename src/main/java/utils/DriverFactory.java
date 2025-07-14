package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DriverFactory {
    public  static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver==null){
            System.setProperty("webdriver.chrome.driver", "/Users/rahulnavgire/Desktop/Softwares/chromedriver/chromedriver");
            ChromeOptions options = new ChromeOptions();
            options.setBinary("/Applications/Google Chrome.app/Contents/MacOS/Google Chrome"); // Set path manually

             driver = new ChromeDriver(options);
             driver.manage().window().maximize();
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        }
        return driver;
    }

    public static void quitDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
    }

}
