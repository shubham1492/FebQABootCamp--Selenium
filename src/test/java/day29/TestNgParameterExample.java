package day29;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class TestNgParameterExample {

    @Test
    @Parameters({"val1","val2"})
    public void sum(int v1,int v2){
        int result = v1+v2;
        System.out.println("The final sum of the given value is "+ result);
    }

    @Test
    @Parameters({"val1","val2"})
    public void diff(int v1,int v2){
        int result = v1-v2;
        System.out.println("The final diff of the given value is "+ result);
    }
}
