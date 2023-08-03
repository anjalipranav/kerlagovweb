package UtilityLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BaseLayer.BaseClass;

public class ExtentReportSetUP extends BaseClass{
//Star and Store Reporting Specific Location 
//get The Current Date and Time
	//Take The ScreenShot Store In Pass or Fail ScreenShot Folder
	
	public static ExtentReports setUp(String ReportName) {
		String path=System.getProperty("user.dir")+"//ExtentReport//"+ReportName+date()+".html";
	ExtentSparkReporter ext=new ExtentSparkReporter(path);
	ExtentReports report=new ExtentReports();
	report.attachReporter(ext);
		
		return report;
		
	}
	public static String date() {
		return new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
	}
	public static String takeScreenShot(String FolderName,String Screenshotname) throws IOException
	{
		TakesScreenshot ts= (TakesScreenshot)driver;
	
		File f=ts.getScreenshotAs(OutputType.FILE);
		String Path=System.getProperty("user.dir")+"//"+FolderName+"//"+Screenshotname+date()+".png";
		FileUtils.copyFile(f, new File(Path));
		return Path;
		
	}
	
}
