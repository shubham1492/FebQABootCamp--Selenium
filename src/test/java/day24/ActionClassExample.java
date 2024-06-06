package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExample {

    public static void main(String[] args) {

        // Step 1: Set the property for Driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver/chromedriver.exe");
        // Step2 : Create Driver Object
        WebDriver driver = new ChromeDriver();
        // Step 3: Launch the url
        String url = "https://demo.guru99.com/test/newtours/";

        driver.get(url);

        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.linkText("Home"));

        Actions actions = new Actions(driver);

        Action mouseOver = actions.moveToElement(element).build();

        WebElement element1 = driver.findElement(By.xpath("//tr[@class='mouseOut'][1]"));

        String bgColor = element1.getCssValue("background-color");

        System.out.println("Before mouse over"+ bgColor);

        mouseOver.perform();

        bgColor = element1.getCssValue("background-color");

        System.out.println("After mouse over"+ bgColor);

    }
}
