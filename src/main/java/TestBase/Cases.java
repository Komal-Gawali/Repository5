package TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Utility.ExtendReportProg;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Cases {
	
	 public ExtentReports report = ExtendReportProg.getReport();
	 public ExtentTest logger ;
	
	
	
//	
//	
	  public static WebDriver  driver;
	  
		public void initialization() throws Exception {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
			
//			driver.get("https://www.saucedemo.com/");
			
		}
}
