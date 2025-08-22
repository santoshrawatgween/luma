package scripts;

import org.testng.annotations.Test;

import genriclib.BaseClass;
import pomPages.MainPage;

public class TestCase1 extends BaseClass
{
	@Test
	public void tc1()
	{
		MainPage p1 = new MainPage(driver);
		p1.signInButtonClick();
	}

}
