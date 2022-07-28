package pagedolibarr;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import modeldolibarr.DraftModel;

public class DraftPage extends DraftModel {

	public DraftPage(WebDriver d) {
		super(d);	
	}
//	public void typeNecessaryinfo(String ref, String lab,String currencyname,String countryname,String statename) throws InterruptedException {
//		typeRefCustomer(ref);
//		typebankla(lab);
//		 clickAcc();
//		 clickCurr(currencyname );
//		 clickSta();
//		 clickCountry(countryname); 
		// typeStateName(statename);
	//}
	public void typeRefCustomer(String ref) {
		WebElement e=getRefCustomer();
		e.sendKeys(ref);
	}
public void typebankla(String lab) throws InterruptedException {
	WebElement e=getbankLabel();
	e.sendKeys(lab);
}

public void  typeAccountType(String accounttype) throws InterruptedException {
	WebElement e= clickaccountType();
	e.click();
	WebElement inputbox = getaccounttypeInputBox();
	inputbox.sendKeys(accounttype);
	inputbox.sendKeys(Keys.ENTER);
}
public void  typeCurrencyName(String currencyname ) throws InterruptedException {
	WebElement e=clickCurrency();
	e.click();
	WebElement inputbox = getcurrencyInputBox();
	inputbox.sendKeys(currencyname);
	inputbox.sendKeys(Keys.ENTER);	
}
public void typeStatus(String status) throws InterruptedException {
	WebElement e=clickStatus();
	e.click();
	WebElement inputbox = getstatusInputBox();
	inputbox.sendKeys(status);
	inputbox.sendKeys(Keys.ENTER);
	
	 }
public void typeaccountCountryName(String countryname) throws InterruptedException {
	WebElement e=clickaccountCountryName();
	new Actions(driver).click(e).perform();
	WebElement inputbox = getaccountryCountryNameInputBox();
	inputbox.sendKeys(countryname);
	inputbox.sendKeys(Keys.ENTER);
		
}
public void typeStateName(String statename) throws InterruptedException {
	WebElement e=clickState();
	e.click();
	WebElement inputbox = getstateNameInputBox();
	inputbox.sendKeys(statename);
	inputbox.sendKeys(Keys.ENTER);	
}
public void typeWebName(String web) {
	WebElement e=getWebName();
	e.clear();
	e.sendKeys(web);
}
public void typeTagName(String tag) throws InterruptedException {
		WebElement inputbox =getTagName();
		inputbox.sendKeys(tag);
		inputbox.sendKeys(Keys.ENTER);
	}
public void typecommentBox(String comment) {
	driver.switchTo().frame(0);
	WebElement e=getCommentBox();
//	clickCommentBar().click();
	e.sendKeys(comment);
	driver.switchTo().defaultContent();

}
public void typeinitiBalance(String ba) {
	WebElement e=getinitialBalance();
	e.clear();
	e.sendKeys(ba);
}
public void clicktableChart() {
	WebElement e=clickdmyTable();
	e.click();
}
public void clickDay(String d ) {
	WebElement e=getDay(d);
	//Select day=new Select(e);
	//day.selectByVisibleText("2");
	//List <WebElement> items = day.getOptions();
	//for(WebElement i : items) {
		//i.getText();
//e.sendKeys(d);
	e.click();
	//}
}
public void clickmonthName(String m) {
	WebElement e=getMonth();
	Select month=new Select(e);
	month.selectByVisibleText(m);
}
public void clickyearList(String y) {
	WebElement e=getYear();
	Select year=new Select(e);
	year.selectByVisibleText(y);
}
public void typeMinimumPay(String allow) {
	WebElement e=getMiniAllow();
	e.sendKeys(allow);
}
public void typeMinimumDesirPay(String desir) {
	WebElement e=getMinimumDesir() ;
	e.sendKeys(desir);
}
public void typebankName(String bankname) {
	WebElement e=getBank() ;
	e.sendKeys(bankname);
}

public void typeaccnumber(String ac) {
	WebElement e=getaccountNum();
e.sendKeys(ac);
}
public void typeBankcode(String bankcode) {
	WebElement e=getBankCode();
	e.sendKeys(bankcode);
}
public void typeBiccode(String biccode) {
	WebElement e=getBicCode();
	e.sendKeys(biccode);
}

public void typeifscname(String ifsc) {
	WebElement e=getIFSC() ;
	e.sendKeys(ifsc);
}
public void typeswiftName(String swift) {
	WebElement e=getswiftNumber() ;
	new Actions(driver).click(e).perform();
	e.sendKeys(swift);
}
public void typebankAddress(String add) {
	WebElement e=getbankAddress() ;
	e.sendKeys(add);
}
public void typebankOwnerName(String name) {
	WebElement e=getaccOwnerName() ;
	e.sendKeys(name);
}
public void typebankOwnerAddress(String ownadd) {
	WebElement e=getaccOwnerAddress();
	e.sendKeys(ownadd);
}

public void typeaccountingAccountName(String accountingAccount) throws InterruptedException {
	WebElement e=clickaccountingAccountName();
	e.click();
	WebElement inputbox = getaccountingAccountInputBox();
	inputbox.sendKeys(accountingAccount);
     inputbox.sendKeys(Keys.ENTER);
	
}
public void typeAccountingJournalTypeName(String journalType) throws InterruptedException {
	WebElement e=clickAccountingJournalName();
	e.click();
//	new Actions(driver).click(e).perform();
	WebElement inputbox = getaccountingJournalInputBox();
	inputbox.sendKeys(journalType);
	inputbox.sendKeys(Keys.ENTER);	
}
public void clickSubmit() {
	WebElement e=clickcreateACc();
	new Actions(driver).click(e).perform();
	
}



















































}