package mod1;

import java.io.IOException;

public class ConfigFileReader {
	propertiesFile p;
	
	public String getReportConfigPath() throws IOException{
		p = new propertiesFile();
		String reportConfigPath = p.getProperty("extentreportPath");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}
	
}
