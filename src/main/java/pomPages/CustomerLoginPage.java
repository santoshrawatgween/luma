package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerLoginPage 
{
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(xpath="//span[text()='Sign In']")
	private WebElement sign_in_button;
	
	
	public CustomerLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String key)
	{
		username.sendKeys(key);
	}
	
	public void enterPassword(String key)
	{
		password.sendKeys(key);
	}
	
	public void signInButtonClick()
	{
		sign_in_button.click();
	}
	
	

}
