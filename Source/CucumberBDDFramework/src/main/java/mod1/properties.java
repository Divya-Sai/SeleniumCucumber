package mod1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class properties {

	public  String getProperty(String PropertyName) throws IOException {
		FileInputStream  fis = new FileInputStream("D:\\Divya-New\\Project\\workspace\\CucumberBDDFramework\\Configs\\Config.properties");
		Properties  p = new Properties();
	    p.load(fis);
	    String S = p.getProperty(PropertyName);
		return S ;
		
	}
}
