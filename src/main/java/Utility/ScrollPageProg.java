package Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import NewWebsit.KayakAuto;
import net.bytebuddy.asm.Advice.Argument;

public class ScrollPageProg extends KayakAuto{

	public static void ScrollUptoEle(WebElement elem) {
		
		JavascriptExecutor j = ((JavascriptExecutor)driver);
		j.executeScript("argument[0].scrollIntoView();", elem);
//		j.executeScript("arguments[0].scrollIntoView();",	WebElement);
	}
	public static void actionOnWebElement(WebElement elem1) {
		Actions a = new Actions(driver);
		a.moveToElement(elem1).build().perform();
		
	for(int i=0; i<=6; i++) {
		   a.sendKeys(Keys.ARROW_DOWN).build().perform();
	   }
	a.sendKeys(Keys.ENTER).click().build().perform();
	}
}
