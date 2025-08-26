package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genriclib.BaseClass;
import pomPages.CustomerLoginPage;
import pomPages.MainPage;

public class TestCase1 extends BaseClass
{
	@Test
	public void tc1() throws FileNotFoundException, IOException
	{
		MainPage p1 = new MainPage(driver);
		p1.signInButtonClick();
		CustomerLoginPage c1 = new CustomerLoginPage(driver);
		c1.enterUsername(pdata.getdata("username"));
		c1.enterPassword(pdata.getdata("password"));
		c1.signInButtonClick();
		Reporter.log("hdsjasjkasbkxj",true);
		
	}

}
