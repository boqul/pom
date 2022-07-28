package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import pagedolibarr.MenuBarPage;
import pagedolibarr.HomePage;
import pagedolibarr.LoginPage;

public class BaseTest {
	WebDriver driver;
	static HomePage homepage;
	static LoginPage loginpage;
	static MenuBarPage bankhomepage;
	@BeforeTest
	public void Setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://demo.dolibarr.org/public/demo/index.php");
		//driver.get("https://demo.dolibarr.org/compta/bank/list.php?mainmenu=bank&leftmenu=");
		
	}
public void getHomePage() {
	homepage=new HomePage(driver);
}
public void getLoginPage() {
	loginpage=new LoginPage(driver);
}

	
}

