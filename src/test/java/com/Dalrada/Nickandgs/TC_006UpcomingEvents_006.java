package com.Dalrada.Nickandgs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Dalrada.Nickandgs.BaseClass;
import WebPages.ExploreMore;
import WebPages.UpcomingEvents;

public class TC_006UpcomingEvents_006 extends BaseClass {
	@Test
	public void order() throws InterruptedException
	{
		
		UpcomingEvents ue = new UpcomingEvents(driver);
		//upcoming events
		ue.clickexlporemore();
		Thread.sleep(2000);
		ue.clickupcomingevents();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		ue.clickselectevent();
		Thread.sleep(2000);
		driver.navigate().back();
		//blu social lounge
		ue.clickexlporemore();
		Thread.sleep(2000);
		ue.clickblusociallounge();
		js.executeScript("window.scrollBy(0,500)");
		ue.clickourmenu();
		driver.navigate().back();
		//gallery
		ue.clickexlporemore();
		Thread.sleep(2000);
		ue.clickgallery();
		//js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		ue.clickdishes();
		Thread.sleep(2000);
		ue.clickdrinks();
		Thread.sleep(2000);
		ue.clickrestaurant();
		Thread.sleep(2000);
		ue.clicklounge();
		Thread.sleep(2000);
		System.out.println("done with 6");
		
		
	}

}
