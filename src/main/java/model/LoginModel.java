package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginModel extends BaseModel {
	public LoginModel(WebDriver d) {
		super(d);
	}
	public WebElement getUserName() {
		By locator = By.xpath("//input[@id='username']");
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		WebElement e = driver.findElement(locator);
		return e;
	}
public WebElement getPassword() {
	WebElement e=driver.findElement(By.xpath("//input[@id='password']"));
	return e;
}
public WebElement getLoginBtn() {
	WebElement e=driver.findElement(By.xpath("//input[@type='submit']"));
	return e;
}
}
