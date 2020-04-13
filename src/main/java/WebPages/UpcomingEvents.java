package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpcomingEvents {
WebDriver driver;

//click on explore more
@FindBy(xpath="(//a[@class='elementor-item elementor-item-anchor has-submenu'])[1]")
private WebElement exploremore;
public void clickexlporemore()
{
	exploremore.click();
}

//click on upcoming events
@FindBy(xpath="(//a[contains(text(), 'UPCOMING EVENTS')])[1]")
private WebElement upcoming;
public void clickupcomingevents()
{
	upcoming.click();
}

//select event events
@FindBy(xpath="(//span[contains(text(), 'Eric French')])[1]")
private WebElement selectevent;
public void clickselectevent()
{
	selectevent.click();
}
	
	//blu social lounge
	
	@FindBy(xpath="(//a[contains(text(), 'BLU SOCIAL LOUNGE')])[1]")
	private WebElement blusociallounge;
	public void clickblusociallounge() 
	{
		blusociallounge.click();
	}
	
	//our menu
	
		@FindBy(xpath="(//span[contains(text(),'OUR MENU')])[11]")
		private WebElement ourmenu;
		public void clickourmenu() 
		{
			ourmenu.click();
		}
	
		//gallery
		
		@FindBy(xpath="(//a[contains(text(), 'GALLERY')])[1]")
		private WebElement gallery;
		public void clickgallery() 
		{
			gallery.click();
		}
	
		//dishes
		
		@FindBy(xpath="//li[contains(text(), 'DISHES')]")
		private WebElement dishes;
		public void clickdishes() 
		{
			dishes.click();
		}
		
		//drinks
		@FindBy(xpath="//li[contains(text(), 'DISHES')]")
		private WebElement drinks;
		public void clickdrinks() 
		{
			drinks.click();
		}
		
		//restaurant
				@FindBy(xpath="//li[contains(text(), 'DISHES')]")
				private WebElement restaurant;
				public void clickrestaurant() 
				{
					restaurant.click();
				}
				
				//lounge
				@FindBy(xpath="//li[contains(text(), 'DISHES')]")
				private WebElement lounge;
				public void clicklounge() 
				{
					lounge.click();
				}
		
public UpcomingEvents(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}
