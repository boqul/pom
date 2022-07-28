package testdolibarr;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lip.ExcelReader;

public class SearchpageTest extends BaseTest {
	@Test(dataProvider="search")
	public void findprj(String username,String password,String ref,String lab, String web,String ba,String y,String m,String d, String allow, String desir, String bankname, String ac, String ifsc, String swift,String add,String name,String ownadd, String countryname
			, String accountingAccount, String journalType,String currencyname, String statename, String bankcode, String biccode, String tag, String accounttype, String status, String comment) throws InterruptedException {
		getHomePage();
		homepage.clickManufactureProd();
		getLoginPage();
		loginpage.typeUserName(username);
		loginpage.typePassword(password);
		loginpage.clickonLogin();
		getMenuBarPage();
		menubarpage.clickBank();
		getbankmenubarpage();
	//	bankmenubarpage.getNewFinancealLink();
		bankmenubarpage.clicklistMenu();
		getSearchPage();
		searchpage.getsearchprjname(lab);
		Thread.sleep(4000);
		searchpage. clickprj();
	
	
}
	
	
	
	@DataProvider(name="search")
	public Object[][] dataloader() throws IOException{
		
	Object[][] t;
		String filename = "data/FBS.xlsx";
	String sheetname = "Sheet1";

		ExcelReader er = new ExcelReader(filename, sheetname);
		//er.updateCell(1, 3); // increment the chase 3 by one.
		t = er.excelToArray();
		return t;
	
	}	
	
}
