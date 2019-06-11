package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactsforCRM {
	WebDriver driver;
	
	@Given("^Click on Contact$")
	public void click_on_Contact() throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//span[contains(.,'Contacts')]")).click();
		
	    
	}

	@When("^Click new and enter details$")
	public void click_new_and_enter_details()  {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(".//button[contains(.,'New')]")).click();
		driver.findElement(By.xpath(".//input[@name='first_name']")).sendKeys("Divya");
		driver.findElement(By.xpath(".//input[@name='last_name']")).sendKeys("Bugatha");
		
	   
	}

	@Then("^Save the details$")
	public void save_the_details() throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath(".//button[contains(.,'Save')]")).click();
	    Thread.sleep(1000);
	}

	@Then("^Close the browser$")
	public void close_the_browser()  {
	    // Write code here that turns the phrase above into concrete actions
	   driver.quit();
	}
}
