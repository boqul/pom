package modeldolibarr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidationModel extends BaseModel {

	public ValidationModel(WebDriver d) {
		super(d);
		
	}
		public WebElement accountTypeValidation() {
			By locator =By.xpath("//td[text()='Account type']/following-sibling::td");
			WebDriverWait wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			WebElement e = driver.findElement(locator);
         	return e;
		
	}
	public WebElement CurrencyValidation() {
		By locator = By.xpath("//table[@class='border tableforfield']/descendant::td[text()='Currency']/following-sibling::td[text()='US Dollars']");
		WebDriverWait wait = new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		WebElement e = driver.findElement(locator);
		return e;
	}
	public WebElement MinimumAllowValidation() {
		WebElement e = driver.findElement(By.xpath("//table[@class='border tableforfield']/child::tbody/descendant::td[text()='Minimum allowed balance']/following-sibling::td[text()='2400']"));
		return e;
	}
	public WebElement MinimumDesirValidation() {
		WebElement e = driver.findElement(By.xpath("//td[text()='Minimum desired balance']/following-sibling::td"));
		return e;
	}
public WebElement accountingAccountNameValidation() {
	WebElement e = driver.findElement(By.xpath("//td[text()='Accounting account']/following-sibling::td"));
	return e;
}
public WebElement AccountingJournalNameValidation() {
	By locator = By.xpath("//td[text()='Accounting code journal']/following-sibling::td");
	WebDriverWait wait = new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	WebElement e = driver.findElement(locator);
	return e;
}

	public WebElement StatusValidation() {
		By locator = By.xpath("//span[contains(@id,'select2-clos-container')]/following-sibling::span/b");
		//WebDriverWait wait = new WebDriverWait(driver,10);
	//wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		WebElement e = driver.findElement(locator);
		return e;
	}
	public WebElement accountCountryNameValidation() {
		WebElement e = driver.findElement(By.xpath("//span[contains(@id,'country_id')]/following-sibling::span/b"));
		return e;
	}
	public WebElement clickStateValidation() throws InterruptedException {
		Thread.sleep(3000);
		WebElement e = driver.findElement(By.xpath("//span[contains(@id,'account_state_id')]/following-sibling::span/b"));
		return e;
	}	
	public WebElement WebNameValidation() {
		WebElement e = driver.findElement(By.xpath("//div[@class='nospan float']/span/following-sibling::a[@target='_blank']"));
		return e;
	}
	public WebElement TagNameValidation() {
		WebElement e = driver.findElement(By.xpath("//td[text()='Tags/categories']/following-sibling::td//input"));
		return e;
	}
	public WebElement CommentBoxValidation() {
		WebElement e = driver.findElement(By.xpath("/html/body"));
		return e;
	}
	public WebElement initialBalanceValidation() {
		WebElement e = driver.findElement(By.xpath("//input[@name='solde']"));
		return e;
	}
//	public WebElement clickdmyTable() {
//		WebElement e = driver.findElement(By.xpath("//div[@class='nowrap inline-block divfordateinput']/child::input/following-sibling::img"));
//		return e;
//	}
	public WebElement DayValidation(String d) {
		WebElement e = driver.findElement(By.xpath("//*[text()='" +d+"']"));
		return e;
	}
	public WebElement MonthValidation() {
		WebElement e = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		return e;
		}
	public WebElement YearValidation() {
		WebElement e = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	return e;
	}
	
	public WebElement BankValidation() {
		WebElement e = driver.findElement(By.xpath("//input[@name='bank']"));
		return e;
	}
	public WebElement BankCodeValidation() {
		WebElement e = driver.findElement(By.xpath("//input[@name='code_banque']"));
		return e;
	}
	public WebElement accountNumberValidation() {
		WebElement e = driver.findElement(By.xpath("//input[@name='number']"));
	return e;
	}
	public WebElement IFSCValidation() {
	WebElement e = driver.findElement(By.xpath("//input[@name='iban']"));
		return e;
	}
    public WebElement swiftNumberValidation() {
		WebElement e = driver.findElement(By.xpath("//*[@id=\"id-right\"]/div/form/div[1]/table[3]/tbody/tr[4]/td[2]/input"));
		return e;
    }
		public WebElement BicCodeValidation() {
			WebElement e=driver.findElement(By.xpath("//input[@name='bic']"));
			return e;
		
	}
	public WebElement bankAddressValidation() {
		WebElement e = driver.findElement(By.xpath("//textarea[@name=\"domiciliation\"]"));
		return e;
	}
	public WebElement accOwnerNameValidation() {
		WebElement e = driver.findElement(By.xpath("//input[@name='proprio']"));
		return e;
	}
	public WebElement accountOwnerAddressValidation() {
		WebElement e = driver.findElement(By.xpath("//textarea[@name=\"owner_address\"]"));
		return e;
	}
	
	
	
	

}
