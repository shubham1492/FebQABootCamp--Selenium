package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileExample {

    public static void main(String[] args) throws InterruptedException {


        // Step 1: Set the property for Driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver/chromedriver.exe");
        // Step2 : Create Driver Object
        WebDriver driver = new ChromeDriver();
        // Step 3: Launch the url
        String url = "https://demo.guru99.com/test/upload/";

        driver.get(url);

        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.className("upload_txt"));

        element.sendKeys("D:\\JAVA- Selenium\\Selenium Content\\Day 8  & 9\\Day 8 How to Upload File in Selenium.docx");


        driver.findElement(By.className("field_check")).click();

        driver.findElement(By.id("submitbutton")).click();

        Thread.sleep(5000);

        String text  = driver.findElement(By.xpath("//h3[@class='demo']/center")).getText();

        System.out.println(text);



        if(text.equals("1 file\n" +
                "has been successfully uploaded.")){
            System.out.println("File upload successfully");
        }else{
            System.out.println("file not uploaded successfully");
        }

    }
}
