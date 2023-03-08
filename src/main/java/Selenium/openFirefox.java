package Selenium;

import java.io.File;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class openFirefox {

	public static void main(String[] args) throws Exception {
     
           WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new FirefoxDriver();
            driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_98xjxt98l7_e&adgrpid=60639568242&hvpone=&hvptwo=&hvadid=617721280315&hvpos=&hvnetw=g&hvrand=8874424991749588421&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007786&hvtargid=kwd-316976916880&hydadcr=5841_2362028&gclid=EAIaIQobChMIku6iyrTg-wIVB7qWCh3Tqgd_EAAYASAAEgLXbPD_BwE");
	    
                 File source = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
                 File dest = new File("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\RealTimeProject\\src\\main\\java\\screenshot\\photo1");
                 System.out.println(source);
            FileHandler.copy(source, dest);
            Thread.sleep(3000);
            driver.quit();
	
	
	
	}

}
