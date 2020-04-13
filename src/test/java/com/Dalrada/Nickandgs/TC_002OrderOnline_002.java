package com.Dalrada.Nickandgs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Dalrada.Nickandgs.BaseClass;
import WebPages.OrderOnline;

public class TC_002OrderOnline_002 extends BaseClass {
	
	@Test
	public void order() throws InterruptedException {
		OrderOnline od = new OrderOnline(driver);
		od.clickorderonline();
		od.switchToChildWindow();
		od.clickgotomenu();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("window.scrollBy(0,250)");
		   Thread.sleep(2000);
		od.clickpastas();
		od.clickpastasmenu();
		Thread.sleep(3000);
		od.clickaddtocart();
		Thread.sleep(2000);
		od.clickokgotit();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.close();
		System.out.println("done with 2");
		
		
	}
	
}
;