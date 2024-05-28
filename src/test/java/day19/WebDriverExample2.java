package day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * Practice Exercise - 2
 * 1.	Launch a new Chrome browser.
 * 2.	Open ToolsQA Practice Automation Page for Switch Windows: https://demoqa.com/browser-windows/
 * Use this statement to click on a New Browser Window button "driver.findElement(By.id("messageWindowButton")).click();"
 * 3.	Close the browser using close() command
 */
public class WebDriverExample2 {
    public static void main(String[] args) {

        // Step 1: Set the property for Driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver/chromedriver.exe");
        // Step2 : Create Driver Object
        WebDriver driver = new ChromeDriver();
        // Step 3: Launch the url
        String url = "https://demoqa.com/browser-windows/";
        driver.get(url);

        driver.findElement(By.id("tabButton")).click();

        driver.quit();

    }
}
