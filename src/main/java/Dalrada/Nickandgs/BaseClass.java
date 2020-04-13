package Dalrada.Nickandgs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class BaseClass {
	public static WebDriver driver;
	@BeforeClass
	@Parameters("browser")
	public void selectBrowsers(String browser) throws Exception{
		//Check if parameter passed from TestNG is 'chrome'
		if(browser.equalsIgnoreCase("chrome")){
		//create chrome instance
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver79.exe");
		driver=new ChromeDriver();
		}

		//Check if parameter passed as 'firefox'
		else if(browser.equalsIgnoreCase("firefox")){
			//set path to chromedriver.exe
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			//create firefox instance
			driver = new FirefoxDriver();
		}
		
		//Check if parameter passed as 'ie'
				else if(browser.equalsIgnoreCase("ie")){
					//set path to chromedriver.exe
					System.setProperty("webdriver.ie.driver","./drivers/IEDriverServer.exe");
					//create internetexplorer instance
					driver = new InternetExplorerDriver();
				}
		driver.get("https://nickandgs.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	@AfterClass
	public void tearDown(){
	    driver.quit();


}
}