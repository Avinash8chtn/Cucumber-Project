package com.runner_package;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Cucumber_Base_Class.base_class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature_package",
glue = "com.stepdefinition_package",
monochrome = true,
dryRun = false,
strict = true,
 plugin = {
		"html:Report/Html_Report",
		
		"pretty",
		
		"json:Json_Report/Report.json",
		
		"com.cucumber.listener.ExtentCucumberFormatter:ExtentReport/extReport.html"
		
		})

public class Test_Runner {
	
	public static WebDriver driver;

	@BeforeClass
	public static void set_Up() 
	{
		
			try {
				driver = base_class.getBrowser("chrome");
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		
	@AfterClass
	public static void tear_Down()
	{
		driver.quit();
	}
}
