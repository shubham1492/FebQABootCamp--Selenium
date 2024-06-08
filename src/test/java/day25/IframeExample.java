package day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeExample {
    public static void main(String[] args) {

        // Step 1: Set the property for Driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver/chromedriver.exe");
        // Step2 : Create Driver Object
        WebDriver driver = new ChromeDriver();
        // Step 3: Launch the url
        String url = "https://demoqa.com/frames";

        driver.get(url);

        driver.manage().window().maximize();

        driver.switchTo().frame(driver.findElement(By.id("frame1")));

       WebElement element = driver.findElement(By.id("sampleHeading"));

       String frameText = element.getText();

        System.out.println("Text of iframe1 :"+ frameText);

        driver.switchTo().defaultContent();

        driver.switchTo().frame(driver.findElement(By.id("frame2")));

        element = driver.findElement(By.id("sampleHeading"));

       frameText = element.getText();

        System.out.println("Text of iframe2 :"+ frameText);

    }
}
