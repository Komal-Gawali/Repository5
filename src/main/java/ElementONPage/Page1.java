package ElementONPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import NewWebsit.KayakAuto;

public class Page1 extends KayakAuto {

	
//	Object repository
	@FindBy(xpath = "//div[@class='vJFP-container']") private WebElement destination;
	
	public Page1() {
		PageFactory.initElements(driver, this);
	}
//	get url og Kayak
	 public String verifyUrl() {
		   return driver.getCurrentUrl();
	 }
	 
//	 Get title 
	 public String verifyTitle() {
		 return driver.getTitle();
	 }
	 
//	 Scroll the page upto benguluru option
	 public void scrollPage() {
		 Utility.ScrollPageProg.actionOnWebElement(destination);
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
