package WebPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ReserveTable {

	// click on Reserve table
	@FindBy(xpath = "//a[contains(text(), 'RESERVE A TABLE')]")
	private WebElement reservetable;

	public void clickonreservetable() {
		reservetable.click();
	}

	// Find a Table
	@FindBy(xpath = "//select[@data-auto='partySizePicker']")
	private WebElement selectnumberofpersons;

	public WebElement getselectnumberofpersons() {
		Select sel = new Select(selectnumberofpersons);
		sel.selectByIndex(5);
		return selectnumberofpersons;
	}

	// Select Date
	@FindBy(xpath = "//input[@data-auto='calendarDatePicker']")
	private WebElement selectDate;

	public void getselectDate() {
		selectDate.click();
	}

	@FindBy(xpath = "(//div[contains(text(), '5')])[2]")
	private WebElement selectDay;

	public void getselectday() {
		selectDay.click();
	}

	// select Time drop down
	@FindBy(xpath = "//select[@data-auto='timePicker']")
	private WebElement selectTime;

	public WebElement getselectTime() {
		Select sel = new Select(selectTime);
		sel.selectByVisibleText("8:00 pm");
		return selectTime;
	}

	// Find a table button

	@FindBy(xpath = "//button[@data-auto='findATableButton']")
	private WebElement clickonbutton;

	public void getclickonbutton() throws InterruptedException {
		clickonbutton.click();
		Thread.sleep(3000);
	}

	// after click on find a table select timings
	@FindBy(xpath = "(//*[contains(text(),'8:00 pm')])[2]")
	private WebElement clickontimings;

	public void getclickontimings() {
		clickontimings.click();
	}

	//select time
	public void clickonTime() throws InterruptedException {
		List<WebElement> list1 = driver
				.findElements(By.xpath("//*[@class='styled__AvailabilityDayWrapper-sc-1xhoeow-5 gybetC']"));
		int listlenth = list1.size();
		for (int i = 0; i <= listlenth - 1; i++) {
			list1.get(i).click();
			Thread.sleep(4000);
		}

	}

	// click on see affiliated restaurants link

	// @FindBy(xpath="//a[@class='styled__StyledAnchorRed-sc-1doch4q-1 djmRYx
	// StyledAnchor-sc-14uq6po-0 eyvCKg']")
	/*private WebElement affiliatedresturants;

	public void getaffiliatedresturants() {
		affiliatedresturants.click();
	}//

	// click on 6:30 timings

	@FindBy(xpath="//a[@data-rid='265747'])[1]")
	private WebElement clickon630;

	public void getclickon630() {
		clickon630.click();
	}*/
	
	//First Name

	@FindBy(xpath = "//input[@placeholder='First name']")
	private WebElement firstname;

	public void getfirstname() {
		firstname.sendKeys("Lavanya");
	}

	//Last Name
	
	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement lastname;

	public void getlastname() {
		lastname.sendKeys("Gowda");
	}
	//Phone Number
	@FindBy(xpath = "//input[@name='phoneNumber']")
	private WebElement phonenumber;

	public void getphonenumber() {
		phonenumber.sendKeys("7022647732");
	}
	
	//Email

	@FindBy(xpath = "//input[@name='email']")
	private WebElement email;

	public void getemail() {
		email.sendKeys("lavanya.h@equalgenius.in");
	}
	//confirm reservation button
	@FindBy(xpath = "//button[contains(text(), 'Confirm Reservation')]")
	private WebElement confirmreservation;

	public void clickconfirmreservation() {
		confirmreservation.click();
	}


	WebDriver driver;

	public ReserveTable(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}

