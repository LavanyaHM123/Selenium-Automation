package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrivateEvents {

	WebDriver driver;
	
	//click on private events
	@FindBy(xpath="(//a[contains(text(), 'PRIVATE EVENTS')])[1]")
	private WebElement privateevents;
	public void clickprivateevents() 
	{
		privateevents.click();
		
	}
	
	//Enter first name
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	private WebElement firstname;
	public void getfirstname() 
	{
		 driver.switchTo().frame("ssf_S0lLTkxMTDPXNU2ysNA1MU421k1MMjPVNU0xMzRPTkyyTEqzAAA");
		firstname.sendKeys("Lavanya");
		
	}
	
	//Enter Last name
	
		@FindBy(xpath="//input[@placeholder='Last Name']")
		private WebElement LastName;
		public void getLastName() 
		{
			LastName.sendKeys("Gowda");
			
		}
		
	
		//Enter email
		
			@FindBy(xpath="//input[@placeholder='Email']")
			private WebElement EMAIL;
			public void getEMAIL() 
			{
				EMAIL.sendKeys("lavanya.h@equalgenius.in");
				
			}
	
			//Enter mobile phone
			
			@FindBy(xpath="//input[@placeholder='Mobile Phone']")
			private WebElement MobilePhone;
			public void getMobilePhone() 
			{
				MobilePhone.sendKeys("7022647732");
				
			}
	
          //pick Date
			
			@FindBy(xpath="//input[@placeholder='Date / Time']")
			private WebElement Date;
			public void PickDate() 
			{
				Date.sendKeys("2020/01/23 13:00");
				
			}

			
	//Number of guests
			
			@FindBy(xpath="//input[@placeholder='# of Guests']")
			private WebElement Numberofguests;
			public void getNumberofguests() 
			{
				Numberofguests.sendKeys("5");
				
			}
			
			//company holiday party
			
			@FindBy(xpath="//input[@placeholder='Company Holiday Party']")
			private WebElement companyholidayparty;
			public void getcompanyholidayparty() 
			{
				companyholidayparty.sendKeys("Holiday party");
				
			}
	
			//Budget 
			
			@FindBy(xpath="//input[@placeholder='Budget']")
			private WebElement Budget;
			public void getBudget() 
			{
				Budget.sendKeys("5000");
				
			}
			
			//additional notes
			
			@FindBy(xpath="//textarea[@placeholder='Additional details / notes']")
			private WebElement notes;
			public void getnotes() 
			{
				notes.sendKeys("Enjoy the party");
				
			}
			
			//submit button
			
			@FindBy(xpath="//button[contains(text(), 'Submit')]")
			private WebElement submitbutton;
			public void Entersubmitbutton() 
			{
				submitbutton.click();
				
			}
			
			
	public PrivateEvents(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}

