package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.base.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature", glue= "com\\adactin\\stepdefinition")

public class Test_Runner {

	public static WebDriver driver;
		@BeforeClass
		public static void setUp() {
			
			driver = BaseClass.browserLaunch("chrome");

		}
		
		@AfterClass
		public static void tearDown() {
			//driver.close();
		}
	
}
