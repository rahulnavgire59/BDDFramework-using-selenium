package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DriverFactory {
    public  static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver==null) {
//            System.setProperty("webdriver.chrome.driver", "/Users/rahulnavgire/Desktop/Softwares/chromedriver/chromedriver");
//            ChromeOptions options = new ChromeOptions();
//            options.setBinary("/Applications/Google Chrome.app/Contents/MacOS/Google Chrome"); // Set path manually

//             driver = new ChromeDriver(options);
//            driver= new ChromeDriver();
//             driver.manage().window().maximize();
//             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

            ChromeOptions options = new ChromeOptions();

            if (System.getProperty("ci") != null && System.getProperty("ci").equalsIgnoreCase("true")) {
                // Headless mode for GitHub Actions
                options.addArguments("--headless=new");
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-dev-shm-usage");
                options.addArguments("--disable-gpu");
                options.addArguments("--disable-extensions");
            } else {
                // Local run with browser visible
                options.addArguments("--start-maximized");
            }
             driver = new ChromeDriver(options);


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
