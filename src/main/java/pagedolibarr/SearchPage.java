package pagedolibarr;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import modeldolibarr.SearchModel;

public class SearchPage extends SearchModel {

	public SearchPage(WebDriver d) {
		super(d);
	}
	public void getsearchprjname(String lab) {
		WebElement e=searchprjname();
		e.click();
//		WebElement inputbox = searchprjname();
//		inputbox.sendKeys(lab);
//		inputbox.sendKeys(Keys.ENTER);

		e.sendKeys(lab);
		e.sendKeys(Keys.ENTER);
	}
	public void clickprj() {
		WebElement e= getprj();
		new Actions(driver).click(e).perform();
	}
}
