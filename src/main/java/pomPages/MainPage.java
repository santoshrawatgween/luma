package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage 
{
	
	@FindBy(partialLinkText = "Sign In")
	private WebElement signInButton;
	
	
	public MainPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void signInButtonClick()
	{
		signInButton.click();
	}
	

}
