package Selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import TestBase.Cases;

public class DesignTestCases extends Cases {
	@FindBy(xpath = "//div[@class='login_logo']")private WebElement logInLogo;
	@FindBy(xpath = "//div[@class='bot_column']")private WebElement botLogo;
	@FindBy(xpath = "//input[@id='user-name']")private static WebElement usernameTextbox;
	@FindBy(xpath = "//input[@id='password']")private static WebElement passwordTextbox;
	@FindBy(xpath = "//input[@id='login-button']")private static WebElement loginBtn;
    @FindBy(xpath = "//span[@class='title']")private WebElement productTitle;
	@FindBy(xpath = "//div[@class='peek']")private WebElement productLogo;
    @FindBy(xpath = "//a[@class='shopping_cart_link']")private WebElement addCartlink;
    @FindBy(xpath = "//button[text()='Add to cart']")private WebElement addCartBtn;
    @FindBy(xpath = "//button[@class='btn btn_secondary btn_small cart_button']")private WebElement removeBtn;
    
	public DesignTestCases() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyTitle() throws Exception  {

	    Thread.sleep(2000);
		return driver.getTitle();
	}
	
	public String verifyCurrentURL() throws Exception {
		Thread.sleep(2000);
		return driver.getCurrentUrl();
	}

	public boolean verifylohInLogo() {
		return logInLogo.isDisplayed();
	}
	
	public  boolean verifybotLogo() {
		return botLogo.isDisplayed();
	}
	
	public boolean verifyuserNameTextboxClick()
	{
		return usernameTextbox.isEnabled();
	}
	
	public boolean verifypasswordTextboxClick()
	{
	   return passwordTextbox.isEnabled();
	}
	
	public boolean verifylogInBtn() {
		return loginBtn.isEnabled();
	}
	 
    public boolean verifyusernamedisplayed() throws Exception {
    	usernameTextbox.sendKeys("standard_user");
    	return usernameTextbox.isDisplayed();
    }
    
    public boolean verifypasswordDisplayed() throws Exception {
    	passwordTextbox.sendKeys("secret_sauce");
    	return passwordTextbox.isDisplayed();
    }
	
	public  WebElement verifyLogInPage() throws Exception {
		logger = report.createTest("Login to saucelab");
		 usernameTextbox.sendKeys("standard_user");
		 logger.log(Status.INFO, "UserName is enter");
		 passwordTextbox.sendKeys("secret_sauce");
		 logger.log(Status.INFO, "Password is enter");
		loginBtn.click();
		logger.log(Status.INFO, "Login button is clicked");
		logger.log(Status.INFO, "Login is Sucessful");
		return usernameTextbox;
	 }
	
    public String verifyProductTitle() throws Throwable {
    	verifyLogInPage();
		return productTitle.getText();
    	 
    }
	
	public boolean verifyProductLogo() throws Throwable {
		verifyLogInPage();
		return productLogo.isDisplayed();
		
	}
	
	public boolean verifyAddcartLink() throws Exception {
		verifyLogInPage();
		   return addCartlink.isDisplayed();
	}
	
	public boolean verifyAddCartBtn() throws Exception {
		verifyLogInPage();
		return addCartBtn.isDisplayed();
		
	}
	
//	public void verifyAddCartBtnClick() throws Exception 
//	 {
//		verifyLogInPage();
//		Thread.sleep(300);
//		List<WebElement> button = addCartBtn.findElements(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
//	    System.out.println(button.size());
//	    for(int i = 0; i< 3; i++)
//	      {
//	    	if(button.get(i).getText().equals("ADD TO CART")) 
//	        	{
//	    		button.get(i).click();
//	    	   }
//	      }
//	  }
//	    public void verifyItemsAdded() throws Exception {
//	    	verifyAddCartBtnClick();
//	    	addCartlink.click();
//	    	
//	    }
	
//	    public void verifyRemoveBtn() throws Exception {
//	    	verifyItemsAdded();
//			Thread.sleep(300);
//	    	 List <WebElement> remove = removeBtn.findElements(By.xpath("//button[@class='btn btn_secondary btn_small cart_button']"));
//	       for(int i=0; i<2; i++);
//	       {
//	    	   if(remove.get(1).getText().equals("REMOVE")) {
//	    	   remove.get(1).click();
//	        }
//	       }

}
