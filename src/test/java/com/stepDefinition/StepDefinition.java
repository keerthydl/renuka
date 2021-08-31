package com.stepDefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.FileReader;
import com.automation.Adactin;

import com.automation.BaseCucumber;
import com.automation.LoginPageWebElements;
import com.testrunner.TestRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinition extends BaseCucumber{
	public static WebDriver driver = TestRunner.driver;
	
	Adactin lp=new Adactin(driver);
	
	@Given("^user should be on the homepage$")
	public void user_should_be_on_the_homepage() throws Throwable  {
		try {
			//getDriver("chrome");
			String url=FileReader.getInstanceFR().getInstanceCR().getURl();
			
			getUrl(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    
	}
	
	@Then("^user shold enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_shold_enter_username_and_password(String username,String password)  {
	
	   
	   try {
		setkey(lp.getUsername(), username);
		setkey(lp.getPassword(), password);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	}
	   

	@Then("^user should clikc the login button$")
	public void user_should_clikc_the_login_button()  {
		
		clickElement(lp.getLogin());
	  
	}
	@Then("^user validate on correct page$")
	public void user_validate_on_correct_page()  {
	//	System.out.println(getTitle());
	   
	}

	@Then("^user should quit the browser$")
	public void user_should_quit_the_browser() {
		//quitt();
	    
	}

}
