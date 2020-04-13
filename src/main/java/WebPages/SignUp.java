package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp {
	WebDriver driver;
	//firstname
	@FindBy(xpath="(//input[@default-placeholder='First Name'])[1]")
	private WebElement firstname;
	public void enterfirstname()
	{
		 driver.switchTo().frame("ssf_M0gzMUu1SEzRNU9LSdU1MU8y1U0yME_TtUxOTk1KsUxMSzE2BQA");
		firstname.sendKeys("Shruti");
	}

	//lastname
		@FindBy(xpath="//input[@default-placeholder='Last Name']")
		private WebElement lastname;
		public void enterlastname()
		{
			lastname.sendKeys("konnur");
		}
		
		//email
		@FindBy(xpath="//input[@default-placeholder='Email']")
		private WebElement email;
		public void enteremail()
		{
			email.sendKeys("shruti.h@equalgenius.in");
		}
		
		//signup
		@FindBy(xpath="//button[contains(text(), 'Sign Up')]")
		private WebElement signup;
		public void clicksignup()
		{
			signup.click();
		}
	
	public SignUp(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
