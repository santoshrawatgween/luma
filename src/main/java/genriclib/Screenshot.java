package genriclib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Screenshot implements AutoConstants
{
	public void getPhoto(WebDriver driver) throws IOException
	{
		Date d = new Date();
		String current_date = d.toString().replace(" ", "_").replace(":", "_");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(photo_path);
		Files.copy(src, dest);
		
	}

}
