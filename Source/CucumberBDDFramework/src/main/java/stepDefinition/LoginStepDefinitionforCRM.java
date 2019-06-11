package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinitionforCRM {
	
	WebDriver driver;
	
	
	
	@Given("^User is already on login page$")
	public void user_already_login_page()  {
		System.setProperty("webdriver.chrome.driver", "D:\\Divya-New\\Project\\SampleMVN\\SampleMVN\\chromedriver-72v\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://freecrm.com/");
		
		
	}
		
	@When("^Click on Log In to enter details$")
	public void logIn_to_enterDetails() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//a[contains(.,'Log In')]")).click();
	}
	
	@Then("^User enters username$")
	public void user_Enters_Username() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//input[@name='email']")).sendKeys("divya.santhoshi2000@gmail.com");
	}
	
	@Then("^User enters password$")
	public void user_Enters_Password() {
		driver.findElement(By.xpath(".//input[@name='password']")).sendKeys("Sai0076!@#");
		driver.findElement(By.xpath("(.//div[contains(.,'Login')])[5]")).click();
		
	}

	@Then("^Verify user is on Home Page$")
	public void verify_user_Home_Page() {
		String s=driver.getTitle();
		System.out.println(s);
		Assert.assertEquals("CRM", s);
	}
	

	
	
	
	
}
