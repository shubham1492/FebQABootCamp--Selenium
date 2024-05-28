package day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsExample {

    public static void main(String[] args) {

        // Step 1: Set the property for Driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver/chromedriver.exe");
        // Step2 : Create Driver Object
        WebDriver driver = new ChromeDriver();
        // Step 3: Launch the url
        //driver.get("https://demoqa.com/text-box/");
        driver.get("https://demoqa.com/links");

        driver.manage().window().maximize();

//        List<WebElement> elements = driver.findElements(By.tagName("textarea"));
//
//        if(elements.size() != 0){
//            System.out.println(elements.size());
//
//            for (WebElement element : elements){
//                System.out.println(element.getAttribute("placeholder"));
//            }
//        }

        List<WebElement> linkElements = driver.findElements(By.tagName("a"));

        if(linkElements.size() != 0){
            System.out.println(linkElements.size());

            for (WebElement element : linkElements){
                System.out.println(element.getText());
            }
        }

    }
}
