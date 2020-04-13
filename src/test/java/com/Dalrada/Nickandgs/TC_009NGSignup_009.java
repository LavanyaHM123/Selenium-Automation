package com.Dalrada.Nickandgs;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Dalrada.Nickandgs.BaseClass;
import WebPages.NegativeSignup;
import WebPages.SignUp;

public class TC_009NGSignup_009 extends BaseClass {
	@Test
	
	public void Sign() throws InterruptedException
	{
		NegativeSignup ns=new NegativeSignup(driver);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(2000);
		ns.enterfirstname();
		ns.enterlastname();
		ns.enteremail();
		ns.clicksignup();
		System.out.println("done with 9");
	}
	
	



}
