package day18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample {

    public static void main(String[] args) {

      // Step 1: Set the property for Driver
      System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver/chromedriver.exe");

      // Step2 : Create Driver Object
        WebDriver driver = new ChromeDriver();
        // Step 3: Launch the url
        driver.get("https://www.flipkart.com/");

        System.out.println(driver.getTitle());

    }
}
