package day29;

import dataprovider.DP;
import org.testng.annotations.Test;

public class TestNgDataProviderDivision {

    @Test(dataProvider = "dp", dataProviderClass = DP.class)
    public void div(int v1,int v2){
        int result = v1/v2;
        System.out.println("The final div of the given value is "+ result);
    }

}
