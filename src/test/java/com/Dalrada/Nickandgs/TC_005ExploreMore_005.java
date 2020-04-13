package com.Dalrada.Nickandgs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Dalrada.Nickandgs.BaseClass;
import WebPages.ExploreMore;
import WebPages.PrivateEvents;

public class TC_005ExploreMore_005 extends BaseClass{
	@Test

	public void order() throws InterruptedException  {
		ExploreMore em = new ExploreMore(driver);
		em.clickExploremore();
		Thread.sleep(2000);
		em.clickcontactus();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		em.clickfirstname();
		em.clicklastname();
		em.clickemail();
		em.clickmessage();
		em.clicksubmit();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		em.clickExploremore();
		Thread.sleep(2000);
		em.clickourspecials();
		
		js.executeScript("window.scrollBy(0,750)");
		em.clickordernow();
		Thread.sleep(2000);
		em.switchToChildWindow();
		em.clickgotomenu();
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		em.clickdesserts();
		Thread.sleep(2000);
		em.clickdessertsmenu();
		Thread.sleep(2000);
		em.clickaddtocart();
		Thread.sleep(2000);
		 /*// Switching to Alert        
        Alert alert = driver.switchTo().alert();
        // Accepting alert		
        alert.accept();	*/
		em.clickokgotit();
		driver.navigate().back();
		System.out.println("done with 5");
		
		
		
		
		

}
}