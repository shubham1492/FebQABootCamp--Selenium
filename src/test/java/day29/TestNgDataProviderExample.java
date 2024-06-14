package day29;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgDataProviderExample {

    @DataProvider(name="dpname")
    public Object[][] dpMethod(){
        return new Object[][] {
                                            {"first-Value"},
                                          {"second-value"}
        };
    }

    @Test(dataProvider = "dpname")
    public void myTest(String val){
        System.out.println("DP Value"+ val);
    }



}
