package pagedolibarr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import modeldolibarr.ValidationModel;

public class ValidationPage extends ValidationModel {

	public ValidationPage(WebDriver d) {
		super(d);
	}
public String getaccountTypeValidation() throws InterruptedException {
	WebElement e=accountTypeValidation();
	String text=e.getText();
	return text;
}
public String getCurrencyValidation(){
	WebElement e=CurrencyValidation();
	String text=e.getText();
	return text;
}
public String getMinimumAllowValidation() {
	WebElement e= MinimumAllowValidation();
	String text=e.getText();
	return text;
}
public String getMinimumDesirValidation() {
	WebElement e= MinimumDesirValidation();
	String text=e.getText();
	return text;
}

public String getaccountingAccountValidation() {
	WebElement e= accountingAccountNameValidation();
	String text=e.getText();
	return text;
}
public String getaccountingJournalValidation() {
	WebElement e= AccountingJournalNameValidation();
	String text=e.getText();
	return text;
}

//public String getStatusValidation() {
//	WebElement e=StatusValidation();
//	String text=e.getText();
//	return text;
//}
//public String getaccountCountryNameValidation()  {
//	WebElement e=accountCountryNameValidation() ;
//	String text=e.getText();
//	return text;
//}
//public String getStateValidation() throws InterruptedException {
//	WebElement e=clickStateValidation();
//	String text=e.getText();
//	return text;
//}
//public String getWebNameValidation() {
//	WebElement e= WebNameValidation();
//	String text=e.getText();
//	return text;
//}
//public String getTagNameValidation(){
//	WebElement e=TagNameValidation();
//	String text=e.getText();
//	return text;
//}
//public String getCommentBoxValidation() {
//	WebElement e=CommentBoxValidation();
//	String text=e.getText();
//	return text;
//}
//public String getinitialBalanceValidation() {
//	WebElement e=initialBalanceValidation();
//	String text=e.getText();
//	return text;
//}
//public String getDayValidation(String d) {
//	WebElement e=DayValidation(d);
//	String text=e.getText();
//	return text;
//}
//public String getMonthValidation() {
//	WebElement e=MonthValidation();
//	String text=e.getText();
//	return text;
//}
//public String getYearValidation() {
//	WebElement e=YearValidation();
//	String text=e.getText();
//	return text;
//}
//public String getBankValidation() {
//	WebElement e= BankValidation();
//	String text=e.getText();
//	return text;
//}
//public String getBankCodeValidation() {
//	WebElement e= BankCodeValidation();
//	String text=e.getText();
//	return text;
//}
//public String getaccountNumberValidation() {
//	WebElement e=accountNumberValidation();
//	String text=e.getText();
//	return text;
//}
//public String getIFSCValidation() {
//	WebElement e= IFSCValidation();
//	String text=e.getText();
//	return text;
//}
//public String getswiftNumberValidation() {
//	WebElement e=swiftNumberValidation();
//	String text=e.getText();
//	return text;
//}
//public String getBicCodeValidation() {
//	WebElement e=BicCodeValidation();
//	String text=e.getText();
//	return text;
//}
//public String getbankAddressValidation() {
//	WebElement e= bankAddressValidation();
//	String text=e.getText();
//	return text;
//}
//public String getaccOwnerNameValidation() {
//	WebElement e= accOwnerNameValidation();
//	String text=e.getText();
//	return text;
//}

}
