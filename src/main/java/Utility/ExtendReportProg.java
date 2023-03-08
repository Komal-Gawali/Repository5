package Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import TestBase.Cases;

public class ExtendReportProg extends Cases {
	
	public static ExtentReports report;
	
	
	public static ExtentReports getReport() {
		
		if(report==null) 
		{
		ExtentHtmlReporter htlmReport = new ExtentHtmlReporter("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\RealTimeProject\\extendReport");
		 report = new ExtentReports();
		 report.attachReporter(htlmReport);
		 report.setSystemInfo("OS", "Windows");
		 report.setSystemInfo("Enviroment", "Production");
		 report.setSystemInfo("Build number", "8.1.1");
		 report.setSystemInfo("Browser", "Chrome");
		 htlmReport.config().setDocumentTitle("UI Automation");
		 htlmReport.config().setReportName("UI Test Report");
		 
		}
     return report;
	}

}
