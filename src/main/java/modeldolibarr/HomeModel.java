package modeldolibarr;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeModel extends BaseModel {
	public HomeModel(WebDriver d) {
		super(d);
	}
public WebElement getManufactureProd() {
	WebElement e=driver.findElement(By.xpath("//*[@id=\"a1profmanufacture\"]/a/div/div[2]"));
	return e;
}

}
