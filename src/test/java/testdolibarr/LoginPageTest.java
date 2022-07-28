package testdolibarr;

import org.testng.annotations.Test;


public class LoginPageTest extends BaseTest {
	@Test//(dataProvider="newaccount")
	public void loginpageTest() {
		getHomePage();
		homepage.clickManufactureProd();
		getLoginPage();
		loginpage.getUserName( );
		loginpage.getPassword( );
		loginpage.clickonLogin();
//		getManuPage();
//		manupage.clickBank();

		
	}
	
//	@DataProvider(name="newaccount")
//	public Object[][] dataloader() throws IOException{
//		
//		Object[][] t;
//
//		String filename = "data/PRO.xlsx";
//		String sheetname = "Sheet1";
//
//		ExcelReader er = new ExcelReader(filename, sheetname);
//		t = er.excelToArray();
//		return t;
//
//	}
}
