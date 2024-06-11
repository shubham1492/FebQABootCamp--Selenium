package day27;

import org.testng.annotations.*;

public class TestNgAnnotationExample {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This will execute before every method");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("This will execute before class");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("This will execute before test");
    }
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("This will execute before suit");
    }

    @Test
    public void test(){
        System.out.println("Test");
    }

    @Test
    public void tes1t(){
        System.out.println("Test1");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("This will execute after every method");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("This will execute after class");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("This will execute after test");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("This will execute after suit");
    }

}
