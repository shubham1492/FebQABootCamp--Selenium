package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {
    public static void main(String[] args) {

        // Step 1: Set the property for Driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver/chromedriver.exe");
        // Step2 : Create Driver Object
        WebDriver driver = new ChromeDriver();
        // Step 3: Launch the url
        String url = "https://demo.guru99.com/test/drag_drop.html";

        driver.get(url);

        driver.manage().window().maximize();

        WebElement from = driver.findElement(By.xpath("//a[normalize-space()='BANK']"));

        WebElement to = driver.findElement(By.xpath("//ol[@id='bank']/li"));

         Actions actions = new Actions(driver);

         actions.dragAndDrop(from,to).build().perform();

    }
}
