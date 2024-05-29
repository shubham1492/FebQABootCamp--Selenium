package day20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedExample {
    public static void main(String[] args) throws InterruptedException {
        // Step 1: Set the property for Driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver/chromedriver.exe");
        // Step2 : Create Driver Object
        WebDriver driver = new ChromeDriver();
        // Step 3: Launch the url
        String url = "https://demoqa.com/automation-practice-form";

        driver.get(url);

        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.xpath("//label[text()='Male']"));

        boolean selectedValue = element.isSelected();

        System.out.println(selectedValue);

        if(!selectedValue){
            element.click();
        }

        Thread.sleep(5000);

        element = driver.findElement(By.id("gender-radio-1"));
        selectedValue = element.isSelected();

        System.out.println("Radio Button Status: "+ selectedValue);


    }
}
