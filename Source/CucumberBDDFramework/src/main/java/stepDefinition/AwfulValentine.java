package stepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mod1.propertiesFile;

public class AwfulValentine {
	
	propertiesFile pf = new propertiesFile();
	WebDriver driver;
	
	@Given("^User able to Navgiate to awfulValentine Application$")
	public void user_able_to_Navgiate_to_awfulValentine_Application() throws IOException  {
	    // Write code here that turns the phrase above into concrete actions
	    System.setProperty("webdriver.chrome.driver", pf.getProperty("DriverPath"));
	    driver = new ChromeDriver();
	    driver.get(pf.getProperty("URL"));
	    driver.manage().window().maximize();
	}

	@When("^Click on Christmas Card$")
	public void click_on_Christmas_Card() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^Click on 10 christmas card from 7.35$")
	public void click_on_christmas_card_from(int arg1, int arg2, int arg3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^Navigate to another window$")
	public void navigate_to_another_window() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^Print the title of the page$")
	public void print_the_title_of_the_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^quit the browser$")
	public void quit_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	

}
