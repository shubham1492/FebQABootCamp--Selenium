package day31;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListener implements ITestListener {

    public void onTestStart(ITestResult result){
        System.out.println("New Test Started"+ result.getName());
    }

    public void onTestSuccess(ITestResult result){
        System.out.println("onTestSuccess method"+ result.getName());
    }

    public void onTestFailure(ITestResult result){
        System.out.println("onTestFailure method"+ result.getName());
    }

    public void onTestSkipped(ITestResult result){
        System.out.println("onTestSkipped method"+ result.getName());
    }

    public void onStart(ITestContext context) {
        System.out.println("onStart method started");
    }

    public void onFinish(ITestContext context){
        System.out.println("onFinish method");
    }



}
