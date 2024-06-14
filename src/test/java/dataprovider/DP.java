package dataprovider;

import org.testng.annotations.DataProvider;

public class DP {

    @DataProvider(name="dp")
    public Object[][] dpMethod(){
        return new Object[][] {
                {5,6},
                {14,15},
                {16,45}
        };
    }
}
