package com.project.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.proj.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//featurefile", glue = "com.project.stepdefinition",monochrome = true)

public class Test_Runner {
	
	public static WebDriver driver;
	
	@BeforeClass

	public static void set_Up() {

		driver=BaseClass.getbrowser("chrome");
	}
	
	@AfterClass
	public static void tear_Down() {

		BaseClass.close();
	}
	
}
