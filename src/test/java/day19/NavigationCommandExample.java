package day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommandExample {
    public static void main(String[] args) {

        // Step 1: Set the property for Driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver/chromedriver.exe");
        // Step2 : Create Driver Object
        WebDriver driver = new ChromeDriver();
        // Step 3: Launch the url
        String url = "https://demoqa.com/books";
        driver.get(url);
        driver.manage().window().maximize();

        driver.navigate().back();

        driver.navigate().forward();

        driver.findElement(By.linkText("Git Pocket Guide")).click();

        driver.navigate().to(url);

        driver.navigate().refresh();

        driver.close();



    }
}
