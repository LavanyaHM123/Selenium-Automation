package com.Dalrada.Nickandgs;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Dalrada.Nickandgs.BaseClass;
import WebPages.OurMenu;

public class TC_007OurMenu_007 extends BaseClass {
	@Test
	public void order() throws InterruptedException
	{
		OurMenu om=new OurMenu(driver);
		om.clickonourmenu();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		om.clickwinemenu();
		//js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(2000);
		//driver.navigate().back();
		om.clickdinnermenu();
		//js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(2000);
		//driver.navigate().back();
		om.clickbrunchmenu();
		//js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(2000);
		//driver.navigate().back();
		om.clickkidsmenu();
		//js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(2000);
		//driver.navigate().back();
		om.clickDessertsmenu();
		//js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("done with 7");
		
	}

}
