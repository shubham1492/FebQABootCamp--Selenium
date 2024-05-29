package day20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayExample {
    public static void main(String[] args) {

        // Step 1: Set the property for Driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver/chromedriver.exe");
        // Step2 : Create Driver Object
        WebDriver driver = new ChromeDriver();
        // Step 3: Launch the url
        String url = "https://demoqa.com/automation-practice-form";

        driver.get(url);

        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.id("firstName"));

        boolean textboxStatus = element.isDisplayed();

        System.out.println(textboxStatus);

        boolean enable =  element.isEnabled();

        System.out.println(enable);

        if(textboxStatus && enable){
            element.sendKeys("shubham");
        }


    }
}
