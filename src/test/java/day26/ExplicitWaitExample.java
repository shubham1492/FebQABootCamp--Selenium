package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitExample {
    public static void main(String[] args) {

        // Step 1: Set the property for Driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver/chromedriver.exe");
        // Step2 : Create Driver Object
        WebDriver driver = new ChromeDriver();
        // Step 3: Launch the url
        String url = "http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html";

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get(url);

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));

        boolean status = driver.findElement(By.xpath("//p[text()='WebDriver']")).isDisplayed();

        if(status){
            System.out.println("Webdriver is visible");
        }else{
            System.out.println("WebDriver is not visible");
        }

    }
}
