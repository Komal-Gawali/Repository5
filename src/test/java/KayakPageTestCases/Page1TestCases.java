package KayakPageTestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ElementONPage.Page1;
import NewWebsit.KayakAuto;

public class Page1TestCases extends KayakAuto{

	Page1 ele;
	
	@BeforeMethod
    public void setup() {
    	startUp();
    	 ele = new Page1();
    }
	
    @Test
    public void verifyCurrentUrl() {
    	 String expUrl = "https://www.kayak.co.in/";
    	 String url = ele.verifyUrl();
    	 Assert.assertEquals(expUrl, url);
    	 Reporter.log("Current URL:- " + url);
    }
    
    @Test
    public void verifyTitleTest() {
    	    String expTitle = "Search Flights, Hotels & Rental Cars | KAYAK";
    	    String actTitle = ele.verifyTitle();
    	    Assert.assertEquals(expTitle, actTitle);
    	    System.out.println(actTitle);
    	    Reporter.log("Actual title is = " + actTitle);
    	    
    }
    
    @Test
    public void scrollPageTest() {
    	ele.scrollPage();
    }
    
    
    
    
    
    
    
    @AfterMethod
    public void closeBrowser() throws Exception {
//    	Thread.sleep(3000);
    	driver.close();
    }
    
    
    
    
}
