package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {
    public static void main(String[] args) {

        // Step 1: Set the property for Driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver/chromedriver.exe");
        // Step2 : Create Driver Object
        WebDriver driver = new ChromeDriver();
        // Step 3: Launch the url
        String url = "https://demo.guru99.com/test/newtours/register.php";

        driver.get(url);

        driver.manage().window().maximize();

       WebElement element =  driver.findElement(By.name("country"));

        Select select = new Select(element);

        select.selectByVisibleText("ARGENTINA");

        select.selectByValue("ANGOLA");

        select.selectByIndex(3);
    }
}
