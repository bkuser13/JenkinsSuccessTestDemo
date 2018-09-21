package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
				
				plugin = {
//				"pretty",
				"html:target/default-cucumber-reports", 
				"json:target/cucumber.json"},
				
				tags = "@google",
				
				features = {"./src/test/resources/feature"},
				glue = {"step_Defs"},
				dryRun = false
			)

public class CukesRunner extends AbstractTestNGCucumberTests{}
