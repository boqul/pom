package pagedolibarr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import modeldolibarr.BankmenubarModel;

public class BankmenubarPage extends BankmenubarModel {

	public BankmenubarPage(WebDriver d) {
		super(d);
		
	}
	public void getNewFinancealLink() {
		WebElement e=nfa();
		e.click();
	}

	public void clicklistMenu() {
		WebElement e=clickList();
		e.click();
	}
}
