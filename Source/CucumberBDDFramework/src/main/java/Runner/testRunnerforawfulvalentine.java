package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Users\\ssaib\\Documents\\SeleniumCucumber\\Source\\CucumberBDDFramework\\src\\main\\java\\Features\\awfulValentine.feature",
                glue={"stepDefintion"},
                plugin = {"pretty"},
                monochrome = true)

public class testRunnerforawfulvalentine {

}
