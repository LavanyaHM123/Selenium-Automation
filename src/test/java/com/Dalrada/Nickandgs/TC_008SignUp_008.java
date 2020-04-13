package com.Dalrada.Nickandgs;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Dalrada.Nickandgs.BaseClass;
import WebPages.SignUp;

public class TC_008SignUp_008 extends BaseClass {
	@Test
	
	public void Sign() throws InterruptedException
	{
		SignUp sp=new SignUp(driver);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(2000);
		sp.enterfirstname();
		
		sp.enterlastname();
		sp.enteremail();
		sp.clicksignup();
		System.out.println("done with 8");
	}
	
	

}
