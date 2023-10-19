package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://barikoi.com/search");
        driver.manage().window().maximize();
        WebElement webElement= driver.findElement(By.cssSelector("#root > div > div.scroll > div > div.search-bar-container > div > form > div > input[type=text]"));

        webElement.sendKeys("@134555");
        WebElement webElement1= driver.findElement(By.cssSelector("#root > div > div.scroll > div > div.search-bar-container > div > form > div > button"));
        webElement1.click();
        Thread.sleep(3000);
        driver.quit();
    }
}
