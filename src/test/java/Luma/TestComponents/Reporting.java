package Luma.TestComponents;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reporting {
	
	public static ExtentReports report(){
		
	
	ExtentSparkReporter reporter =new ExtentSparkReporter(System.getProperty("user.dir")+"//reports//index.html");
	reporter.config().setReportName("Luma Test results");
	reporter.config().setDocumentTitle("Test results");
	
	ExtentReports extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Tester", "gourav");
	return extent;
	}
}
