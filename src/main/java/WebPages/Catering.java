package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Catering {
	WebDriver driver;
	//click on catering
		@FindBy(xpath="//a[contains(text(), 'CATERING')]")
		private WebElement catering;
		public void clickcatering() throws InterruptedException
		{
			catering.click();
			Thread.sleep(7000);
		}
		//Enter first name
		
		@FindBy(xpath="//input[@placeholder='First Name']")
		private WebElement firstname;
		public void getfirstname() 
		{ 
			 driver.switchTo().frame("ssf_M7JINDIwNE_TNUk0NNI1MU420rU0szTXTTFNNrRMs7QwN7c0AAA");
			firstname.sendKeys("Lavanya");
			
		}
		
		//Enter Last name
		
			@FindBy(xpath="//input[@placeholder='Last Name']")
			private WebElement LastName;
			public void getLastName() 
			{
				
				LastName.sendKeys("Gowda");
				
			}
			
			//Enter mobile phone
			
			@FindBy(xpath="//input[@placeholder='Mobile Phone']")
			private WebElement MobilePhone;
			public void getMobilePhone() 
			{
				
				MobilePhone.sendKeys("7022647732");
				
			}
			
		
			//Enter email
			
				@FindBy(xpath="//input[@placeholder='Email']")
				private WebElement EMAIL;
				public void getEMAIL() 
				{
					 
					EMAIL.sendKeys("lavanya.h@equalgenius.in");
					
				}
		
//# in party
				
				@FindBy(xpath="//input[@placeholder='# in party']")
				private WebElement inparty;
				public void getinparty() 
				{
					inparty.sendKeys("Decoration");
					
				}
		
	          //pick Date
				
				@FindBy(xpath="//input[@placeholder='Date / Time']")
				private WebElement Date;
				public void PickDate() 
				{
					Date.sendKeys("2020/01/23 13:00");
					
				}
				
				//event location				
				@FindBy(xpath="//input[@placeholder='Event Location or Address']")
				private WebElement loaction ;
				public void getloaction() 
				{
					loaction.sendKeys("Bangalore");
					
				}
				
//Budget 
				
				@FindBy(xpath="//input[@placeholder='Budget']")
				private WebElement Budget;
				public void getBudget() 
				{
					Budget.sendKeys("5000");
					
				}
				
		
				
				//notes			
				@FindBy(xpath="//textarea[@placeholder='Notes']")
				private WebElement notes;
				public void getnotes() 
				{
					notes.sendKeys("Book Table");
					
				}
				
				//submit button
				
				@FindBy(xpath=" //button[contains(text(), 'Submit')]")
				private WebElement submitbutton;
				public void Entersubmitbutton() 
				{
					submitbutton.click();
					
				}
		
		public Catering(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}

}



