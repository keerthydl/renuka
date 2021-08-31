package com.testrunner;

import cucumber.api.junit.Cucumber;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.helper.FileReader;
import com.automation.BaseCucumber;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\java\\com\\cucumber",
                 glue ="com\\stepDefinition",
                 monochrome=true,
                 dryRun=false,
                 plugin= {"pretty", 
                		 "com.cucumber.listener.ExtentCucumberFormatter:renuka/extentReport.html"}
                 )
public class TestRunner {
  
	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() throws Throwable {
		
			String browsername = FileReader.getInstanceFR().getInstanceCR().getBrowser();
			System.out.println(browsername);
			driver=BaseCucumber.getDriver(browsername);
				
				
			
				
	}
}
