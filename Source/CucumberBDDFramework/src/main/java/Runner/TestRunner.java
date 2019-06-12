package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ssaib\\Documents\\SeleniumCucumber\\Source\\CucumberBDDFramework\\src\\main\\java\\Features\\login.feature"
                 ,glue={"stepDefinition"},plugin = {"pretty"},
                 monochrome = true)
                
public class TestRunner {
	
}
