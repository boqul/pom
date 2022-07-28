package model;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomeModel extends BaseModel {
	public HomeModel(WebDriver d) {
		super(d);
	}
public WebElement getManufactureProd() {
	WebElement e=driver.findElement(By.xpath("//*[@id=\"a1profmanufacture\"]/a/div/div[2]"));
	return e;
}
}