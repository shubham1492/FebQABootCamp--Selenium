package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindALLinksOnPage {
    public static void main(String[] args) {

        // Step 1: Set the property for Driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver/chromedriver.exe");
        // Step2 : Create Driver Object
        WebDriver driver = new ChromeDriver();
        // Step 3: Launch the url
        String url = "https://demoqa.com/links";

        driver.get(url);

        driver.manage().window().maximize();

        List<WebElement> elementList = driver.findElements(By.tagName("a"));

        for(WebElement element : elementList){
            System.out.println(element.getText());
        }


    }
}
