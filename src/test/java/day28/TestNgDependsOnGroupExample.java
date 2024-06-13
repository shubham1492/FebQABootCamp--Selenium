package day28;

import org.testng.annotations.Test;

public class TestNgDependsOnGroupExample {


    @Test(groups = "sanity")
    public void signIn(){
        System.out.println("SIgn in application once browser is launch ");
    }

    @Test(groups = "sanity")
    public void openBrowser(){
        System.out.println("Open Browser and launch the URL");
    }

    @Test(dependsOnGroups = "sanity")
    public void viewHomePage(){
        System.out.println("go to home page");
    }
}
