package stepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;

public class Closebrowser {
	WebDriver driver ;
	
	@Given("^Close the browser$")
	public void close_browser() {
		driver.quit();
	}

}
