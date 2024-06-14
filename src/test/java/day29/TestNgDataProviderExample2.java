package day29;

import dataprovider.DP;
import org.testng.annotations.Test;

public class TestNgDataProviderExample2 {


    @Test(dataProvider = "dp", dataProviderClass = DP.class)
    public void sum(int v1,int v2){
        int result = v1+v2;
        System.out.println("The final sum of the given value is "+ result);
    }

    @Test(dataProvider = "dp", dataProviderClass = DP.class)
    public void diff(int v1,int v2){
        int result = v1-v2;
        System.out.println("The final diff of the given value is "+ result);
    }

    @Test(dataProvider = "dp", dataProviderClass = DP.class)
    public void mul(int v1,int v2){
        int result = v1*v2;
        System.out.println("The final mul of the given value is "+ result);
    }

}
