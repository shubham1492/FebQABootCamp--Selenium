package day31;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNgListener.class)
public class TestListenerExample {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        // Step 1: Set the property for Driver
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
        // Step2 : Create Driver Object
        driver = new ChromeDriver();
    }

    @Test
    public void firstTest() {
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in123";
        Assert.assertEquals(title,expectedTitle);
    }

    @Test
    public void SecondTest(){
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
        Assert.assertEquals(title,expectedTitle);
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }


}
