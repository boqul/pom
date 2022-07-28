package pagedolibarr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import modeldolibarr.MenuBarModel;

public class MenuBarPage extends MenuBarModel {
	public MenuBarPage(WebDriver d) {
		super(d);
	}
	public void clickBank() {
		WebElement e=getBank(); 
//		Actions ac=new Actions(driver);
	e.click();
//	ac.perform();

}
}