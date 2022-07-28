package testdolibarr;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lip.ExcelReader;

public class DraftPageTest extends BaseTest {
	@Test(dataProvider="newaccount")
	public void draftpageTest( String username,String password,String ref,String lab, String web,String ba,String y,String m,String d, String allow, String desir, String bankname, String ac, String ifsc, String swift,String add,String name,String ownadd, String countryname
			, String accountingAccount, String journalType,String currencyname, String statename, String bankcode, String biccode, String tag, String accounttype, String status, String comment) throws InterruptedException, IOException {
		getHomePage();
		homepage.clickManufactureProd();
		getLoginPage();
		loginpage.typeUserName(username);
		loginpage.typePassword(password);
		loginpage.clickonLogin();
		getMenuBarPage();
		menubarpage.clickBank();
		getbankmenubarpage();
		bankmenubarpage.getNewFinancealLink();
	getDraftPage();
		draftpage.typeRefCustomer(ref);
		draftpage.typebankla(lab);
	    draftpage. typeAccountType(accounttype);
		draftpage. typeCurrencyName(currencyname );		              
		draftpage.typeStatus(status);
		draftpage.typeaccountCountryName(countryname);
		draftpage.typeStateName(statename);
		draftpage.typeWebName(web);
		draftpage.typeTagName(tag);
	    draftpage.typecommentBox(comment);
		draftpage.typeinitiBalance(ba);
		draftpage.clicktableChart();
             draftpage.clickyearList(y);
			draftpage.clickmonthName(m);
			draftpage.clickDay(d);
		draftpage.typeMinimumPay(allow);
		draftpage.typeMinimumDesirPay(desir);
		draftpage.typebankName(bankname);
		draftpage.typeBankcode(bankcode);
		draftpage.typeBiccode(biccode);
		draftpage.typeaccnumber(ac);
		draftpage.typeifscname(ifsc);
		draftpage.typeswiftName(swift);
			draftpage.typebankAddress(add);
			draftpage.typebankOwnerName(name);
			draftpage.typebankOwnerAddress(ownadd);
			draftpage.typeaccountingAccountName(accountingAccount);
			draftpage.typeAccountingJournalTypeName(journalType);
	
		    draftpage.clickSubmit();
		
			
//			//read cell
//			String filename = "data/FBS.xlsx";
//			String sheetname = "Sheet1";
//
//				ExcelReader er = new ExcelReader(filename, sheetname);
//
//			String expected_currencyname = er.getCellData(1, 21);
//			System.out.println(expected_currencyname);
//			String expected_countryname = er.getCellData(1, 18);
//			System.out.println(expected_countryname);

			
			
			
			
	}
@DataProvider(name="newaccount")
	public Object[][] dataloader() throws IOException{
		
	Object[][] t;
		String filename = "data/FBS.xlsx";
	String sheetname = "Sheet1";

		ExcelReader er = new ExcelReader(filename, sheetname);
		er.updateCell(1, 3); // increment the chase 3 by one.
		t = er.excelToArray();
		return t;

	}
}
