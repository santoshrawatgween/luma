package genriclib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile implements AutoConstants
{
	public String getdata(String key) throws FileNotFoundException, IOException
	{
		Properties pdata = new Properties(); 
		pdata.load(new FileInputStream(property_file_path));
		return pdata.getProperty(key);
		
	}

}
