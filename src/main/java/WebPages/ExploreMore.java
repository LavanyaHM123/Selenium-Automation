package WebPages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExploreMore {
WebDriver driver;
	
	//click on explore more
	@FindBy(xpath="(//a[@class='elementor-item elementor-item-anchor has-submenu'])[1]")
	private WebElement Exploremore;
	public void clickExploremore() 
	{
		Exploremore.click();
	}
		
		//contact us
		
		@FindBy(xpath="(//a[contains(text(), 'CONTACT US')])[1]")
		private WebElement contactus;
		public void clickcontactus() 
		{
			contactus.click();
			}
		
		//Enter first name
		@FindBy(xpath="//input[@placeholder='First Name']")
		private WebElement firstname;
		public void clickfirstname() 
		{
			 driver.switchTo().frame("ssf_MzQyNDAzMrHQNTE0MtU1MbVM0U00TTTRNTYwMEwzNDU0SrawAAA");
			firstname.sendKeys("Lavanya");
			}
		
		
		//Enter last name
				@FindBy(xpath="//input[@placeholder='Last Name']")
				private WebElement lastname;
				public void clicklastname() 
				{
					lastname.sendKeys("Gowda");
					}
				
				//Enter email
				@FindBy(xpath="//input[@placeholder='Email']")
				private WebElement email;
				public void clickemail() 
				{
					email.sendKeys("Lavanya.h@equalgenius.in");
					}
				
				//Enter message
				@FindBy(xpath="//textarea[@placeholder='Message']")
				private WebElement message;
				public void clickmessage() 
				{
					message.sendKeys("reserve the table");
					}
				
				//click on submit button
				@FindBy(xpath="//button[@type='submit']")
				private WebElement submit;
				public void clicksubmit() 
				{
					submit.click();
					}
				//Our specials
				
				@FindBy(xpath="(//a[contains(text(), 'OUR SPECIALS')])[1]")
				private WebElement ourspecials;
				public void clickourspecials() 
				{
					ourspecials.click();
					}
				
				//order now
				
				@FindBy(xpath="(//span[contains(text(), 'ORDER NOW')])[1]")
				private WebElement ordernow;
				public void clickordernow() 
				{
					ordernow.click();
					}
				
				
				public void switchToChildWindow() {
					String MainWindow = driver.getWindowHandle();
					Set<String> s1 = driver.getWindowHandles();
					Iterator<String> i1 = s1.iterator();
					while (i1.hasNext()) {
						String ChildWindow = i1.next();
						if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

							// Switching to Child window
							driver.switchTo().window(ChildWindow);

						}
					}
				}
				
				//click on go to menu button
				@FindBy(xpath="//button[@class='button loading-button button-primary button-full button-lg']")
				private WebElement gotomenu;
				public void clickgotomenu()
				{
					gotomenu.click();
				}	
			
	//click on desserts
				
			
				@FindBy(xpath="(//h2[@c-type='heading-xs-accent'])[5]")
				private WebElement desserts;
				public void clickdesserts()
				{
					desserts.click();
				}	
				
				//click on menus of desserts
				@FindBy(xpath="//p[contains(text(), 'Carrot Cake')]")
				private WebElement dessertsmenu;
				public void clickdessertsmenu()
				{
					dessertsmenu.click();
				}
				
				//click on add to cart button
				
				@FindBy(xpath="//button[@type='submit']")
				private WebElement addtocart;
				public void clickaddtocart()
				{
					addtocart.click();
				}
				
				//click on go it
				@FindBy(xpath="//button[contains(text(), 'Got It')]")
				private WebElement okgotit;
				public void clickokgotit()
				{
					okgotit.click();
				}
				
	public ExploreMore(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}