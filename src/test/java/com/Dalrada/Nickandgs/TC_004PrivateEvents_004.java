package com.Dalrada.Nickandgs;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import Dalrada.Nickandgs.BaseClass;
import WebPages.Catering;
import WebPages.PrivateEvents;

public class TC_004PrivateEvents_004 extends BaseClass{
	
	  @Test
	  
	public void order() throws InterruptedException  {
		PrivateEvents pe = new PrivateEvents(driver);
		pe.clickprivateevents();
		Thread.sleep(2000);
		pe.getfirstname();
		pe.getLastName();
		pe.getEMAIL();
		pe.getMobilePhone();
		Thread.sleep(3000);
		pe.PickDate();
		pe.getNumberofguests();
		pe.getcompanyholidayparty();
		pe.getBudget();
		pe.getnotes();
		pe.Entersubmitbutton();
		System.out.println("done with 4");
}
}
