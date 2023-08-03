package UtilityLayer;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import BaseLayer.BaseClass;

public class ListenerSetUp extends BaseClass implements ITestListener{
	//Implement TheItestListener with Extend Report
	ExtentReports reports;
	ExtentTest extTest;
	@Override
	public void onStart(ITestContext context) {
		reports=ExtentReportSetUP.setUp(context.getSuite().getName());
		
	}
	@Override
	public void onTestStart(ITestResult result) {
		extTest=reports.createTest(result.getMethod().getMethodName());
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		extTest.log(Status.PASS , "Test Case Is Pass "+result.getMethod().getMethodName());
	try {
		extTest.addScreenCaptureFromPath(ExtentReportSetUP.takeScreenShot("PassScreenShot", result.getMethod().getMethodName()));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		extTest.log(Status.FAIL , "Test Case Is Fail "+result.getMethod().getMethodName());
		try {
			extTest.addScreenCaptureFromPath(ExtentReportSetUP.takeScreenShot("FailScreenShot", result.getMethod().getMethodName()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		extTest.log(Status.SKIP , "Test Case Is Skip "+result.getMethod().getMethodName());
		
	}

	
	@Override
	public void onFinish(ITestContext context) {
		reports.flush();
		}

	
	
	
}