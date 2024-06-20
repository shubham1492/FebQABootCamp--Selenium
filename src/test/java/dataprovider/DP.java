package dataprovider;

import org.testng.annotations.DataProvider;
import utils.ExcelReader;

public class DP {

    @DataProvider(name="dp")
    public Object[][] dpMethod(){
        return new Object[][] {
                {5,6},
                {14,15},
                {16,45}
        };
    }

    @DataProvider(name="loginDetails")
    public Object[][] loginMethod(){

        Object [][] arrayObject = ExcelReader.getExcelData("src/test/resources/Testdata.xls",
                "userdata");
        return arrayObject;
    }


}
