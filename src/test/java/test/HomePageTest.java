package test;

import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
	@Test
	public void homepageTest() {
		getHomePage();
		homepage.clickManufactureProd();
		
	}

}
