package com.Dalrada.Nickandgs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Dalrada.Nickandgs.BaseClass;
import WebPages.Catering;
import WebPages.OrderOnline;

public class TC_003Catering_003 extends BaseClass{

	 @Test
	public void order() throws InterruptedException {
		Catering ct = new Catering(driver);
		ct.clickcatering();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("window.scrollBy(0,500)");
		   Thread.sleep(3000);
		  // driver.switchTo().frame("ssf_M7JINDIwNE_TNUk0NNI1MU420rU0szTXTTFNNrRMs7QwN7c0AAA");
		   //driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("test@gmail.com");
		   ct.getfirstname();
		   Thread.sleep(2000);
		   ct.getLastName();
		   ct.getMobilePhone();
		   ct.getEMAIL();
		   ct.getinparty();
		   ct.PickDate();
		   ct.getloaction();
		   ct.getBudget();
		   ct.getnotes();
		   ct.Entersubmitbutton();
		   Thread.sleep(3000);
		   driver.navigate().back();
		   System.out.println("done with 3");
		
		
	}

}
