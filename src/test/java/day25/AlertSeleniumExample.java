package day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertSeleniumExample {
    public static void main(String[] args) {

        // Step 1: Set the property for Driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver/chromedriver.exe");
        // Step2 : Create Driver Object
        WebDriver driver = new ChromeDriver();
        // Step 3: Launch the url
        String url = "https://demo.guru99.com/test/delete_customer.php";

        driver.get(url);

        driver.manage().window().maximize();

        driver.findElement(By.name("cusid")).sendKeys("1234");

        driver.findElement(By.name("submit")).click();

        driver.switchTo().alert().accept();

        String alertMsg = driver.switchTo().alert().getText();

        if(alertMsg.equals("Customer Successfully Delete!")){
            System.out.println("user is deleted successfully");
        }else{
            System.out.println("not able to delete");
        }

        driver.switchTo().alert().accept();

        driver.close();
    }
}
