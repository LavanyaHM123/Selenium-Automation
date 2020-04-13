package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OurMenu {
	WebDriver driver;
	 
	//click on our menu
	@FindBy(xpath="(//span[contains(text(), 'OUR MENUS')])[1]")
	private WebElement ourmenu;
	public void clickonourmenu()
	{
		ourmenu.click();	
	}

	//wine menu
	
	@FindBy(xpath="(//span[contains(text(), 'WINE MENU')])[2]")
	private WebElement winemenu;
	public void clickwinemenu()
	{
		winemenu.click();	
	}
	
	//dinner menu
	
		@FindBy(xpath="(//span[contains(text(), 'DINNER MENU')])[2]")
		private WebElement dinnermenu;
		public void clickdinnermenu()
		{
			dinnermenu.click();	
		}
	
	
		//brunch menu
		
		@FindBy(xpath="(//span[contains(text(), 'BRUNCH MENU')])[2]")
		private WebElement brunchmenu;
		public void clickbrunchmenu()
		{
			brunchmenu.click();	
		}
		
		//kids menu
		
		@FindBy(xpath="(//span[contains(text(), 'KIDS MENU')])[2]")
		private WebElement kidsmenu;
		public void clickkidsmenu()
		{
			kidsmenu.click();	
		}
		
		//Desserts menu
		
		@FindBy(xpath="(//span[contains(text(), 'DESSERTS MENU')])[2]")
		private WebElement Dessertsmenu;
		public void clickDessertsmenu()
		{
			Dessertsmenu.click();	
		}
	public OurMenu(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
	}
}
