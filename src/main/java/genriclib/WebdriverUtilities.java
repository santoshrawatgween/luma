package genriclib;

import org.openqa.selenium.WebDriver;

public class WebdriverUtilities
{
	public void alertPopUpOk(WebDriver driver)
	{
		driver.switchTo().alert().accept();
		
	}
	
	
	public void alerPopUpCancel(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}

}
