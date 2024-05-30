package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class FindBrokenLinks {

    public static void verifyLinks(String linkUrl){

        try {
            URL url = new URL(linkUrl);

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

            httpURLConnection.connect();

            if(httpURLConnection.getResponseCode()>=400){
                System.out.println(linkUrl + "-"+httpURLConnection.getResponseMessage()+ " is a broken link");
            }else{
                System.out.println(linkUrl + "-"+httpURLConnection.getResponseMessage());
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

        // Step 1: Set the property for Driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver/chromedriver.exe");
        // Step2 : Create Driver Object
        WebDriver driver = new ChromeDriver();
        // Step 3: Launch the url
        String url = "https://demoqa.com/broken";

        driver.get(url);

        driver.manage().window().maximize();

        List<WebElement> elementList = driver.findElements(By.tagName("a"));

        System.out.println(elementList.size());

        for(int i=0;i<elementList.size();i++){
            WebElement element = elementList.get(i);
            String linkUrl = element.getAttribute("href");
            verifyLinks(linkUrl);
        }
    }
}
