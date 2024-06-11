package day27;

import org.testng.annotations.Test;

public class TestNgPriorityExample {

    @Test(priority = 1)
    public void b_Method(){
        System.out.println("b_method");
    }

    @Test
    public void a_Method(){
        System.out.println("a_method");
    }

}
