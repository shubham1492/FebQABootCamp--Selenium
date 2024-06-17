package day30;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNgAssertExample {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        // Step 1: Set the property for Driver
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
        // Step2 : Create Driver Object
        driver = new ChromeDriver();
    }

    @Test
    public void  testVerifyPageTitle(){

        driver.get("https://toolsqa.com/");
        String title = driver.getTitle();
        System.out.println(title);
        String expectedTitle = "Tools QA1";
        Assert.assertEquals(title,expectedTitle,"Title is not matching");
        System.out.println("rest of the code");
    }


    @Test
    public void  testVerifyPageTitle1(){

        driver.get("https://toolsqa.com/");
        SoftAssert softAssert = new SoftAssert();
        String title = driver.getTitle();
        System.out.println(title);
        String expectedTitle = "Tools QA1";
        softAssert.assertEquals(title,expectedTitle,"Title is not matching");
        System.out.println("rest of the code");
        softAssert.assertEquals(title,"Tools Demo");
        softAssert.assertAll();
    }

}
