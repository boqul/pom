package modeldolibarr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuBarModel extends BaseModel {

	public MenuBarModel(WebDriver d) {
		super(d);
		
	}
public WebElement getBank() {
	WebElement e=driver.findElement(By.xpath("//*[@id=\"mainmenutd_bank\"]/div/a[1]/div"));
	return e;
}
}
