package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DropDownHandlingWithoutSelectClass {
    public static void main(String[] args) {

        // Step 1: Set the property for Driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver/chromedriver.exe");
        // Step2 : Create Driver Object
        WebDriver driver = new ChromeDriver();
        // Step 3: Launch the url
        String url = "https://demo.guru99.com/test/newtours/register.php";

        driver.get(url);

        driver.manage().window().maximize();

        driver.findElement(By.name("country")).click();

        List<WebElement> elementList = driver.findElements(By.xpath("//select[@name='country']/option"));

        System.out.println(elementList.size());

        for(int i=0;i<elementList.size();i++){
            if(elementList.get(i).getText().equals("INDIA")){
                elementList.get(i).click();
                break;
            }
        }

    }
}
