package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.selenium.axis_Utility_files.Utility_Files;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./Feature", glue = "com.stepdefinition", 
				monochrome = true, publish = true, 
				plugin = {"pretty", "json:Reports/Repo.json",
						"html:Reports/Repo.html"})

public class AxisBank_Runner {
	public static WebDriver driver;

	@BeforeClass
	public static void set_Up() {
		driver = Utility_Files.get_Browser("chrome");
	}

	@AfterClass
	public static void tear_Down() {
		driver.close();
	}
}
