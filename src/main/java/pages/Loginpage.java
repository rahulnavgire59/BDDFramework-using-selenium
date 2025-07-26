package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
    WebDriver driver;


    public Loginpage(WebDriver driver) {
        this.driver= driver;
    }

    By wb_usernamme = By.xpath("//input[@name='username']");
    By wb_password = By.xpath("//input[@name='password']");
    By login_btn = By.xpath("//button[@type='submit']");

    public void enterUsername(String uName) throws InterruptedException {
        Thread.sleep(5000);
    driver.findElement(wb_usernamme).sendKeys(uName);
    }

    public void enterPassword(String password){
        driver.findElement(wb_password).sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(login_btn).click();
    }



}
