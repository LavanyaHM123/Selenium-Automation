package WebPages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderOnline {
	WebDriver driver;
	//click on order table
		@FindBy(xpath="//a[contains(text(), 'ORDER ONLINE')]")
		private WebElement orderonline;
		public void clickorderonline() throws InterruptedException
		{
			orderonline.click();
			Thread.sleep(7000);
		}
		
		//click on go to menu button
		
		@FindBy(xpath="//button[@class='button loading-button button-primary button-full button-lg']")
		private WebElement gotomenu;
		public void clickgotomenu()
		{
			gotomenu.click();
		}
		
		//click on go to menu button use sets method to handle windows
		
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
		
		//click on pasta
		@FindBy(xpath="(//h2[@c-type='heading-xs-accent'])[3]")
		private WebElement pastas;
		public void clickpastas()
		{
			pastas.click();
		}
		
		//click on menus of pasta
		@FindBy(xpath="//p[contains(text(), 'Wild Boar Bolognese')]")
		private WebElement pastasmenu;
		public void clickpastasmenu()
		{
			pastasmenu.click();
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
	
		
		public OrderOnline(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}

}
