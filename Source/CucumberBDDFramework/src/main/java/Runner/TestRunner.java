package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Divya-New\\Project\\workspace\\CucumberBDDFramework\\src\\main\\java\\Features\\login.feature"
                 ,glue={"stepDefinition"},plugin = {"pretty"},
                 monochrome = true)
                
public class TestRunner {
	
}
