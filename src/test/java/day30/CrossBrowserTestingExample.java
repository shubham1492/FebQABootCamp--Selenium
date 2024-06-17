package day30;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTestingExample {
    WebDriver driver;

    @Parameters("browser")
    @BeforeTest
    public void setup(String browser) throws Exception {
        if(browser.equalsIgnoreCase("firefox")){
            driver= new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else{
            throw  new Exception("Incorrect Browser");
        }
        driver.get("https://www.browserstack.com/");
    }

    @Test
    public void verifyTitle(){
        System.out.println("Title is : "+driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Most Reliable App & Cross Browser Testing Platform | BrowserStack");
        //driver.quit();
    }




}
