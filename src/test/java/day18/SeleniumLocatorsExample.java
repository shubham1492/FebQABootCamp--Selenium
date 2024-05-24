package day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocatorsExample {
    public static void main(String[] args) {

        // Step 1: Set the property for Driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver/chromedriver.exe");
        // Step2 : Create Driver Object
        WebDriver driver = new ChromeDriver();
        // Step 3: Launch the url
        driver.get("https://demoqa.com/links");

        driver.manage().window().maximize();

//        WebElement element = driver.findElement(By.id("firstName"));
//
//        element.sendKeys("Shubham");
//
//        element = driver.findElement(By.id("lastName"));
//
//        element.sendKeys("Jain");

        //driver.findElement(By.name("gender")).click();

        //driver.findElement(By.className("practice-form-wrapper"));


        driver.findElement(By.linkText("Home")).click();

        driver.findElement(By.tagName("a"));

        driver.findElement(By.cssSelector("input[id='userEmail']"));

        driver.findElement(By.xpath("//input[@id='userEmail']"));


    }
}
