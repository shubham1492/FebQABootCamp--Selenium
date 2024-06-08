package day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowExample2 {
    public static void main(String[] args) {

        // Step 1: Set the property for Driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver/chromedriver.exe");
        // Step2 : Create Driver Object
        WebDriver driver = new ChromeDriver();
        // Step 3: Launch the url
        String url = "https://demoqa.com/browser-windows";

        driver.get(url);

        driver.manage().window().maximize();

        String mainWindow = driver.getWindowHandle();

        driver.findElement(By.id("windowButton")).click();

        Set<String> set = driver.getWindowHandles();

        Iterator<String> itr =  set.iterator();

        while (itr.hasNext()) {

            String childWindow = itr.next();

            if (!mainWindow.equalsIgnoreCase(childWindow)) {

                driver.switchTo().window(childWindow);

                String title = driver.findElement(By.id("sampleHeading")).getText();

                System.out.println(title);

                driver.quit();

            }
        }
}
}
