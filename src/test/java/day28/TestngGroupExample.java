package day28;

import org.testng.annotations.Test;

public class TestngGroupExample {

    @Test(groups = {"sanity","regression"})
    public void b_Method(){
        System.out.println("b_method");
    }

    @Test(groups = {"sanity1"})
    public void a_Method(){
        System.out.println("a_method");
    }
    @Test(groups = "sanity")
    public void c_Method(){
        System.out.println("c_method");
    }
    @Test(groups = {"sanity1"})
    public void f_Method(){
        System.out.println("f_method");
    }
    @Test(groups = "sanity")
    public void d_Method(){
        System.out.println("d_method");
    }
    @Test
    public void e_Method(){
        System.out.println("e_method");
    }
    @Test(groups = "sanity")
    public void g_Method(){
        System.out.println("g_method");
    }
    @Test
    public void I_Method(){
        System.out.println("I_method");
    }
    @Test(groups = "sanity")
    public void h_Method(){
        System.out.println("h_method");
    }



}
