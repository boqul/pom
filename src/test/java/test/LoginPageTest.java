package test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lip.ExcelReader;


public class LoginPageTest extends BaseTest {
	@Test(dataProvider="newaccount")
	public void createaccountpageTest(String username,String password) {
		getHomePage();
		homepage.clickManufactureProd();
		getLoginPage();
		loginpage.typeUserName(username);
		loginpage.typePassword(password);
		loginpage.clickonLogin();
		getHomePage();
		bankhomepage.clickBank();
		
		
		
	}
	
	@DataProvider(name="newaccount")
	public Object[][] dataloader() throws IOException{
		
		Object[][] t;

		String filename = "data/PRO.xlsx";
		String sheetname = "Sheet1";

		ExcelReader er = new ExcelReader(filename, sheetname);
		t = er.excelToArray();
		return t;

	}
}
