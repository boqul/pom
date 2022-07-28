package model;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BankHomeModel extends BaseModel {
	public BankHomeModel(WebDriver d) {
		super(d);
	}
	public WebElement getManuB() {
		By locator=By.xpath("//*[@id=\"mainmenuspan_bank\"]");
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		WebElement e = driver.findElement(locator);
		return e;

	}
//	public void clickPopupNoti() {

		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");

		//System.setProperty("webdriver.chrome.driver","dirver/chromedriver.exe");

			//WebDriver driver =new ChromeDriver(options);
			//Alert alt=driver.switchTo().alert();
	//		alt.dismiss();
			//}

}
