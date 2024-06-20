package day31;

import dataprovider.DP;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ExcelReaderDataProviderExample {

    @Test(dataProvider = "loginDetails",dataProviderClass = DP.class)
    public void verifyLoginDetails(String username,String password,String status){
        System.out.println("UserName:"+ username);
        System.out.println("Password:"+ password);
        System.out.println("status:"+ status);
    }

}
