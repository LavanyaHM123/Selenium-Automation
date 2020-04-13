package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NegativeSignup {
	WebDriver driver;
	//firstname
	@FindBy(xpath="(//input[@default-placeholder='First Name'])[1]")
	private WebElement firstname;
	public void enterfirstname()
	{
		 driver.switchTo().frame("ssf_M0gzMUu1SEzRNU9LSdU1MU8y1U0yME_TtUxOTk1KsUxMSzE2BQA");
		firstname.sendKeys("1234");
	}

	//lastname
		@FindBy(xpath="//input[@default-placeholder='Last Name']")
		private WebElement lastname;
		public void enterlastname()
		{
			lastname.sendKeys("5678");
		}
		
		//email
		@FindBy(xpath="//input[@default-placeholder='Email']")
		private WebElement email;
		public void enteremail()
		{
			email.sendKeys("");
		}
		
		//signup
		//@FindBy(xpath="//button[contains(text(), 'Sign Up')]")
		@FindBy(xpath="//button[contains(text(), 'Sign U')]")
		private WebElement signup;
		public void clicksignup()
		{
			signup.click();
		}
	
	public NegativeSignup(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
