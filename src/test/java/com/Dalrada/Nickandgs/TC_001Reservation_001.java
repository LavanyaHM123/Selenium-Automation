package com.Dalrada.Nickandgs;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Dalrada.Nickandgs.BaseClass;
import WebPages.ReserveTable;

public class TC_001Reservation_001 extends BaseClass {
	
	 @Test
	public void LoginTest() throws InterruptedException
	{
		
		ReserveTable rt=new ReserveTable(driver);
		rt.clickonreservetable();
		rt.getselectnumberofpersons();
		rt.getselectDate();
		Thread.sleep(3000);
		rt.getselectday();
		rt.getselectTime();
		rt.getclickonbutton();
		rt.getclickontimings();
		 rt.clickonTime();
		//rt.getaffiliatedresturants();
		//rt.getclickon630();
		rt.getfirstname();
		rt.getlastname();
		rt.getphonenumber();
		rt.getemail();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("window.scrollBy(0,500)");
		   Thread.sleep(2000);
		rt.clickconfirmreservation();
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("done with 1");
		
	}

}
