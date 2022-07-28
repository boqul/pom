package testdolibarr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;


import pagedolibarr.BankmenubarPage;
import pagedolibarr.ValidationPage;
import pagedolibarr.MenuBarPage;
import pagedolibarr.SearchPage;
import pagedolibarr.DraftPage;
import pagedolibarr.HomePage;
import pagedolibarr.LoginPage;

public class BaseTest {
	WebDriver driver;
	static HomePage homepage;
	static LoginPage loginpage;
	static MenuBarPage menubarpage;
	static BankmenubarPage bankmenubarpage;
	static DraftPage draftpage;
	static SearchPage searchpage;
	static ValidationPage vp;
	@BeforeTest
	public void Setup() throws InterruptedException {

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");

			System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
//WebDriverManager.chromiumdriver().setup();
			 driver =new ChromeDriver(options);
		
		driver.get("https://demo.dolibarr.org/public/demo/index.php");
		driver.manage().window().maximize();
		//driver.get("https://demo.dolibarr.org/compta/bank/list.php?mainmenu=bank&leftmenu=");
		
	}
public void getHomePage() {
	homepage=new HomePage(driver);
}
public void getLoginPage() {
	loginpage=new LoginPage(driver);
}
public void getMenuBarPage() {
	menubarpage=new MenuBarPage(driver);	
}
public void getbankmenubarpage() {
	bankmenubarpage=new BankmenubarPage(driver);
}
public void getDraftPage() {
	draftpage=new DraftPage(driver);
}
public void getSearchPage() {
	searchpage=new SearchPage(driver);
}
public void getValidation() {
	vp=new ValidationPage(driver);
}




}
