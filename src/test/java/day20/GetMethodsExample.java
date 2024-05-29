package day20;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetMethodsExample {
    public static void main(String[] args) throws InterruptedException {

        // Step 1: Set the property for Driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver/chromedriver.exe");
        // Step2 : Create Driver Object
        WebDriver driver = new ChromeDriver();
        // Step 3: Launch the url
        String url = "https://demoqa.com/links";

        driver.get(url);

        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.id("bad-request"));

        element.click();

        Thread.sleep(5000);

        String label = driver.findElement(By.id("linkResponse")).getText();

        System.out.println(label);

        System.out.println("Tag Name:"+ element.getTagName());

       String cssValue =  element.getCssValue("color");

       System.out.println("css value "+ cssValue);

       Dimension dimension = element.getSize();

        System.out.println(dimension.height + " "+ dimension.width);

    }
}
