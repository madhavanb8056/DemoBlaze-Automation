package com.runner.demoblaze;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.base.classes.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature\\demoblaze\\Demoblaze.feature",
glue = "com.stedefinition.demoblaze",
monochrome = true,
dryRun = false,
publish = true,
plugin = {"html:Report/rpe.html","pretty"}
		)

public class Runnerclass_demoblaze {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void start() {
       
		driver = Base_Class.browser_Launch("chrome");
		
		Base_Class.maximize(driver);
	    Base_Class.implicit_Wait(driver, 30);
	   
	}
	
	@AfterClass
	public static void end() {
       
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
