package testdolibarr;

import org.testng.annotations.Test;

public class MenuBarPageTest extends BaseTest {
@Test
public void menubarpageTest() {
	getHomePage();
	homepage.clickManufactureProd();
	getLoginPage();
	loginpage.typeUserName("demo");
	loginpage.typePassword("demo");
	loginpage.clickonLogin();
	getMenuBarPage();
	menubarpage.clickBank();
	
}
}