package day28;

import org.testng.annotations.Test;

public class TestNgDependentExample {

    @Test(dependsOnMethods = "openBrowser")
    public void signIn(){
        System.out.println("SIgn in application once browser is launch ");
    }

    @Test
    public void openBrowser(){
        System.out.println("Open Browser and launch the URL");
    }
}
