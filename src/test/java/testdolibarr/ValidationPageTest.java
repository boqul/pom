package testdolibarr;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import lip.ExcelReader;

public class ValidationPageTest extends BaseTest {
	@Test
	public void VpageTest( ) throws IOException, InterruptedException{
		getHomePage();
		homepage.clickManufactureProd();
		getLoginPage();
		loginpage.typeUserName("demo");
		loginpage.typePassword("demo");
		loginpage.clickonLogin();
		getMenuBarPage();
		menubarpage.clickBank();
		getbankmenubarpage();
	//	bankmenubarpage.getNewFinancealLink();
		bankmenubarpage.clicklistMenu();
		getSearchPage();
		searchpage.getsearchprjname("chase 174");
		Thread.sleep(4000);
		searchpage. clickprj();
		getValidation();
		String filename = "data/FBS.xlsx";
		String sheetname = "Sheet1";
        ExcelReader er = new ExcelReader(filename, sheetname);
//    String expectedaccounttype=vp.getaccountTypeValidation();
//	String actualaccounttype=er.getCellData(1, 26);
//	Assert.assertEquals(actualaccounttype, expectedaccounttype);

	String expectedcurrency=vp.getCurrencyValidation();
	String actualcurrency=er.getCellData(1, 21);
	Assert.assertTrue(actualcurrency.contains(expectedcurrency));
	
    	 String expectedminimumallow=vp. getMinimumAllowValidation();
     	String actualminimumallow=er.getCellData(1, 9);
     	Assert.assertEquals(actualminimumallow, expectedminimumallow);
     	
     	
     		String expectedminimumdesir=vp. getMinimumDesirValidation();
	String actualminimumdesir=er.getCellData(1, 10);
	Assert.assertEquals(actualminimumdesir, expectedminimumdesir);
	
	String expectedaccountingacc=vp. getaccountingAccountValidation();
	String actualaccountionacc=er.getCellData(1, 19);
	Assert.assertEquals(actualaccountionacc, expectedaccountingacc);
	
	String expectedaccountingjour=vp. getaccountingJournalValidation();
	String actualaccountingjour=er.getCellData(1, 20);
	Assert.assertTrue(actualaccountingjour.contains(expectedaccountingjour));
	
	
	
	
	
	
	
	
	
	
	
	
	

		//        String expectedwebname=vp. getWebNameValidation();
//    	String actualwebname=er.getCellData(1, 4);
//    	Assert.assertEquals(actualwebname, expectedwebname);
//	
	
	}		
			
			
	}
	
	
	
	
	
	
	
