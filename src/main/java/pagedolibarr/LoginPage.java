package pagedolibarr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.LoginModel;

public class LoginPage extends LoginModel {
	public LoginPage(WebDriver d) {
		super(d);
	}
	public void typeUserName(String username ) {
		WebElement e=getUserName();
		e.clear();
		e.sendKeys(username);
	}
public void typePassword(String password) {
	WebElement e=getPassword();
	e.clear();
	e.sendKeys(password);
}
public void clickonLogin() {
	WebElement e=getLoginBtn();
	e.click();
}
//public void Ref(String ref) {
	//WebElement e=ref();
	//e.sendKeys(ref);
//}
}