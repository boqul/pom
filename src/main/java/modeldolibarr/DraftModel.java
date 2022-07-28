package modeldolibarr;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DraftModel extends BaseModel {

	public DraftModel(WebDriver d) {
		super(d);
	}
	public WebElement getRefCustomer() {
		By locator = By.xpath("//input[@name='ref']");
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		WebElement e = driver.findElement(locator);
		return e;
		
	}
	public WebElement getbankLabel() {
		By locator = By.xpath("//input[@name='label']");
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		WebElement e = driver.findElement(locator);
		return e;
	}
	public WebElement getaccounttypeInputBox() throws InterruptedException {
		Thread.sleep(3000);
		WebElement e = driver.findElement(By.xpath("//input[not(@placeholder) and @tabindex='0']"));
		return e;
	}
	public WebElement clickaccountType() {
		By locator = By.xpath("//span[contains(@id,'select2-type-container')]/following-sibling::span/b");
//		WebDriverWait wait = new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		WebElement e = driver.findElement(locator);
		return e;
	}
	public WebElement getcurrencyInputBox() throws InterruptedException {
		Thread.sleep(3000);
		WebElement e = driver.findElement(By.xpath("//input[not(@placeholder) and @tabindex='0']"));
		return e;
	}
	public WebElement clickCurrency() {
		By locator = By.xpath("//span[contains(@id,'account_currency_code')]/following-sibling::span/b");
//		WebDriverWait wait = new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		WebElement e = driver.findElement(locator);
		return e;
	}
	public WebElement getstatusInputBox() throws InterruptedException {
		Thread.sleep(3000);
		WebElement e = driver.findElement(By.xpath("//input[not(@placeholder) and @tabindex='0']"));
		return e;
	}
	public WebElement clickStatus() {
		By locator = By.xpath("//span[contains(@id,'select2-clos-container')]/following-sibling::span/b");
		//WebDriverWait wait = new WebDriverWait(driver,10);
	//wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		WebElement e = driver.findElement(locator);
		return e;
	}
	public WebElement getaccountryCountryNameInputBox() throws InterruptedException {
		Thread.sleep(3000);
		WebElement e = driver.findElement(By.xpath("//input[not(@placeholder) and @tabindex='0']"));
		return e;
	}
	public WebElement clickaccountCountryName() {
		WebElement e = driver.findElement(By.xpath("//span[contains(@id,'country_id')]/following-sibling::span/b"));
		return e;
	}
	public WebElement getstateNameInputBox() throws InterruptedException {
		WebElement e = driver.findElement(By.xpath("//input[not(@placeholder) and @tabindex='0']"));
		return e;
	}
	public WebElement clickState() throws InterruptedException {
		By locator = By.xpath("//span[contains(@id,'account_state_id')]/following-sibling::span/b");
		WebDriverWait wait = new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		WebElement e = driver.findElement(locator);
	return e;
	}	
	public WebElement getWebName() {
		WebElement e = driver.findElement(By.xpath("//input[@name='url']"));
		return e;
	}
	public WebElement getTagName() {
		WebElement e = driver.findElement(By.xpath("//td[text()='Tags/categories']/following-sibling::td//input"));
		return e;
	}
	public WebElement getCommentBox() {
		WebElement e = driver.findElement(By.xpath("/html/body"));
		return e;
	}
	public WebElement getinitialBalance() {
		WebElement e = driver.findElement(By.xpath("//input[@name='solde']"));
		return e;
	}
	public WebElement clickdmyTable() {
		WebElement e = driver.findElement(By.xpath("//div[@class='nowrap inline-block divfordateinput']/child::input/following-sibling::img"));
		return e;
	}
	public WebElement getDay(String d) {
		WebElement e = driver.findElement(By.xpath("//*[text()='" +d+"']"));
		return e;
	}
	public WebElement getMonth() {
		WebElement e = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		return e;
		}
	public WebElement getYear() {
		WebElement e = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	return e;
	}
	public WebElement getMiniAllow() {
		WebElement e = driver.findElement(By.xpath("//input[@name='account_min_allowed']"));
		return e;
	}
	public WebElement getMinimumDesir() {
		WebElement e = driver.findElement(By.xpath("//input[@name='account_min_desired']"));
		return e;
	}
	public WebElement getBank() {
		WebElement e = driver.findElement(By.xpath("//input[@name='bank']"));
		return e;
	}
	public WebElement getBankCode() {
		WebElement e = driver.findElement(By.xpath("//input[@name='code_banque']"));
		return e;
	}
	public WebElement getaccountNum() {
		WebElement e = driver.findElement(By.xpath("//input[@name='number']"));
	return e;
	}
	public WebElement getIFSC() {
	WebElement e = driver.findElement(By.xpath("//input[@name='iban']"));
		return e;
	}
    public WebElement getswiftNumber() {
		WebElement e = driver.findElement(By.xpath("//*[@id=\"id-right\"]/div/form/div[1]/table[3]/tbody/tr[4]/td[2]/input"));
		return e;
    }
		public WebElement getBicCode() {
			WebElement e=driver.findElement(By.xpath("//input[@name='bic']"));
			return e;
		
	}
	public WebElement getbankAddress() {
		WebElement e = driver.findElement(By.xpath("//textarea[@name=\"domiciliation\"]"));
		return e;
	}
	public WebElement getaccOwnerName() {
		WebElement e = driver.findElement(By.xpath("//input[@name='proprio']"));
		return e;
	}
	public WebElement getaccOwnerAddress() {
		WebElement e = driver.findElement(By.xpath("//textarea[@name=\"owner_address\"]"));
		return e;
	}
	public WebElement getaccountingAccountInputBox() {
		WebElement e = driver.findElement(By.xpath("//input[not(@placeholder) and @tabindex='0']"));
		return e;
	}
	public WebElement clickaccountingAccountName() {
		WebElement e = driver.findElement(By.xpath("//span[contains(@id,'account_number')]/following-sibling::span/b"));
		return e;
	}
	public WebElement getaccountingJournalInputBox() {
		WebElement e = driver.findElement(By.xpath("//input[not(@placeholder) and @tabindex='0']"));
		return e;
	}
	public WebElement clickAccountingJournalName() {
		By locator = By.xpath("//span[contains(@id,'fk_accountancy_journal')]/following-sibling::span/b");
//		WebDriverWait wait = new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		WebElement e = driver.findElement(locator);
		return e;
	}
	
	
	public WebElement clickcreateACc() {
		WebElement e = driver.findElement(By.xpath("(//*[@type='submit'])[1]"));
		return e;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
