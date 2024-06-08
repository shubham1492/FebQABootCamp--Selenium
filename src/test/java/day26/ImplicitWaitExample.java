package day26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaitExample {
    public static void main(String[] args) {

        // Step 1: Set the property for Driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver/chromedriver.exe");
        // Step2 : Create Driver Object
        WebDriver driver = new ChromeDriver();
        // Step 3: Launch the url
        String url = "https://demoqa.com/";

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get(url);

        driver.manage().window().maximize();

        String title = driver.getTitle();

        System.out.println(title);

    }
}
