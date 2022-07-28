package testdolibarr;

import org.testng.annotations.Test;

public class BankmenubarpageTest extends BaseTest {
@Test
public void bankmenubarpageTest() {
	getHomePage();
	homepage.clickManufactureProd();
	getLoginPage();
	loginpage.typeUserName("demo");
	loginpage.typePassword("demo");
	loginpage.clickonLogin();
	getMenuBarPage();
	menubarpage.clickBank();
	getbankmenubarpage();
	bankmenubarpage.getNewFinancealLink();
	bankmenubarpage.clicklistMenu();

			
}

}
	
		
	
	


