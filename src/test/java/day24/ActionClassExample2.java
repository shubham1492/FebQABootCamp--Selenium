package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExample2 {
    public static void main(String[] args) {
        // Step 1: Set the property for Driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver/chromedriver.exe");
        // Step2 : Create Driver Object
        WebDriver driver = new ChromeDriver();
        // Step 3: Launch the url
        String url = "https://www.facebook.com/";

        driver.get(url);

        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.id("email"));

        WebElement element1= driver.findElement(By.id("pass"));

        Actions actions = new Actions(driver);

        actions.moveToElement(element)
                .click()
                .sendKeys(element,"xyz@gmail.com")
                .keyDown(Keys.TAB)
                .sendKeys(element1,"temp@123")
                .contextClick()
                .build()
                .perform();

    }
}
