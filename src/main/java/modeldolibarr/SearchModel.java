package modeldolibarr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchModel extends BaseModel {

	public SearchModel(WebDriver d) {
		super(d);
	}
public WebElement searchprjname() {
	WebElement e=driver.findElement(By.xpath("//input[@name='search_ref']/following::input[@name='search_label']"));
	return e;
}
public WebElement getprj() {
	By locator = By.xpath("//td[@class='nowrap']/a");
	WebDriverWait wait = new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	WebElement e = driver.findElement(locator);
	return e;
	}


}
