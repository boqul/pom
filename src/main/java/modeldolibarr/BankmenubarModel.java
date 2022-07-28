package modeldolibarr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BankmenubarModel extends BaseModel {
public BankmenubarModel(WebDriver d) {
	super(d);
}
public WebElement nfa() {
	WebElement e=driver.findElement(By.xpath("//a[@title='New financial account']"));
	return e;
}
public WebElement clickList() {
	WebElement e=driver.findElement(By.xpath("//div[@class='menu_contenu menu_contenu_compta_bank_list']/child::a"));
	return e;
}
}
