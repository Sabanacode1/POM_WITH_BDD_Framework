package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	
	@CucumberOptions(
			features = "src//test//resources//features//",
			glue = "stepdefs",
			monochrome=true,
			dryRun = false
			
			)
	
	public class ECommRunner extends AbstractTestNGCucumberTests{

	}