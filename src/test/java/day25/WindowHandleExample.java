package day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandleExample {
    public static void main(String[] args) {

          // Step 1: Set the property for Driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver/chromedriver.exe");
        // Step2 : Create Driver Object
        WebDriver driver = new ChromeDriver();
        // Step 3: Launch the url
        String url = "https://demo.guru99.com/popup.php";

        driver.get(url);

        driver.manage().window().maximize();

        String mainWindow = driver.getWindowHandle();

        driver.findElement(By.linkText("Click Here")).click();

        Set<String> set = driver.getWindowHandles();

       Iterator<String> itr =  set.iterator();

       while (itr.hasNext()){

           String childWindow = itr.next();

           if(!mainWindow.equalsIgnoreCase(childWindow)){

               driver.switchTo().window(childWindow);

               driver.findElement(By.name("emailid")).sendKeys("shubham@gamil.com");

               driver.findElement(By.name("btnLogin")).click();

               String title = driver.findElement(By.xpath("//h2[text()='Access details to demo site.']")).getText();

               System.out.println(title);

               driver.switchTo().window(mainWindow);

               driver.quit();

           }

       }

    }

}
