package TestCase;

import java.awt.Rectangle;

import javax.accessibility.AccessibleExtendedText;
import javax.accessibility.AccessibleTextSequence;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Selenium.DesignTestCases;
import TestBase.Cases;
import net.bytebuddy.agent.builder.AgentBuilder.Identified.Extendable;

public class ExecuteTestCase extends Cases{

	DesignTestCases logIn;
    Extendable report;
    @BeforeMethod
 public void setup() throws Exception
       {   
	        initialization();
	         logIn = new DesignTestCases();
	       
        }
    @BeforeClass
    public static void startTest() {
    	
    }
    
    @Test
    public void verifyTitletest() throws Exception 
    {
  	 String exptitle = "Swag Labs";
  	 String actTitle = logIn.verifyTitle();
  	 Assert.assertEquals(exptitle, actTitle);
  	 Reporter.log("Actual Title:-"+ actTitle);
    }
   
    @Test
    public void verifyCurrentURLtest() throws Exception
    {
  	  String actUrl = "https://www.saucedemo.com/";
  	  String currentURl = logIn.verifyCurrentURL();
  	  Assert.assertEquals(currentURl, actUrl);
  	  Reporter.log("Current Url :- " + currentURl);
    }
    @Test
    public void verifylogInLogotest()
    {
  	  boolean actLogInLogo = logIn.verifylohInLogo();
  	  Assert.assertEquals(actLogInLogo, true);
    }
    @Test
    public void verifybotLogotest() 
    {
  	boolean actBotoLogo = logIn.verifybotLogo();
  	Assert.assertEquals(actBotoLogo, true);
    }
    
    @Test
    public void verifyusernameTextboxClickTest() {
  	  boolean userTextbox = logIn.verifyuserNameTextboxClick();
  	  Assert.assertEquals(userTextbox, true);
    }
    
    
    @Test
    public void verifypasswordClickTest() {
  	  boolean passwordBox = logIn.verifypasswordTextboxClick();
  	  Assert.assertEquals(passwordBox, true);
    }
    
    @Test
    public void verifylogInBtnTest() {
  	  boolean actStatus = logIn.verifylogInBtn();
  	  Assert.assertEquals(actStatus, true);
    }
    @Test
    public void verifyusernamedisplayedTest() throws Throwable {
  	       boolean actResult = logIn.verifyusernamedisplayed();
  	       Assert.assertEquals(actResult, true);
  	       Reporter.log(null, actResult);
    }

    @Test
    public void verifypasswordDisplayedTest() throws Exception {
  	  boolean actResultPassword = logIn.verifypasswordDisplayed();
  	  Assert.assertEquals(actResultPassword, true);
  	  
    }
    
    @Test
    public void verifyLogInPageTest() throws Throwable {
  	  WebElement pageLogIn = logIn.verifyLogInPage();
    }
    
    @Test
    public void verifyProductTitleTest() throws Throwable
    {
  	  String expTitle = "PRODUCTS";
  	  String actTitle = logIn.verifyProductTitle();
  	  
  	  Assert.assertEquals(expTitle, actTitle);
  	  Reporter.log(actTitle);
    }
    
    @Test
    public void verifyProductLogoTest() throws Throwable
    {
  	  boolean actProductLogo = logIn.verifyProductLogo();
  	  Assert.assertEquals(actProductLogo, true);
  	   }
    @Test
    public void verifyAddcartLinkTest() throws Exception
    {
  	        boolean actcart = logIn.verifyAddcartLink();
  	        Assert.assertEquals(actcart, true);
    }
    
    @Test
    public void verifyAddCartBtnTest() throws Exception {
  	  boolean actBtn = logIn.verifyAddCartBtn();
  	  Assert.assertEquals(actBtn, true);
    }
    
//    @Test
//    public void verifyAddCartBtnClickTest() throws Exception {
//  	  logIn.verifyAddCartBtnClick();
//    }
//    
//    @Test
//    public void verifyItemsAddedTest() throws Exception
//    {
//  	  logIn.verifyItemsAdded();
//    }
//    
//    @Test
//    public void verifyRemoveBtnTest() throws Exception {
//  	  logIn.verifyRemoveBtn();
//    }
    @AfterMethod
    public void closeBrowser() throws InterruptedException {
    	
    	Thread.sleep(3000);
    	driver.quit();
    }
    
}
