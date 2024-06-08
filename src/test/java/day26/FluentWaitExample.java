package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.function.Function;

public class FluentWaitExample {
    public static void main(String[] args) {

        // Step 1: Set the property for Driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver/chromedriver.exe");
        // Step2 : Create Driver Object
        WebDriver driver = new ChromeDriver();
        // Step 3: Launch the url
        String url = "http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html";

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get(url);

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[text()='Click Me - Fluent Wait']")).click();

        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        wait .until(new Function<WebDriver, WebElement>() {


            @Override
            public WebElement apply(WebDriver webDriver) {

                WebElement element = webDriver.findElement(By.xpath("//p[text()='Software Testing Material - DEMO PAGE']"));

                boolean status = element.isDisplayed();

                if(status){
                    System.out.println("Text is visible");
                }

                return element;

            }
        });


    }
}
