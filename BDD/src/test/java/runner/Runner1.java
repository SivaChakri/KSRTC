package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="Feature", glue="scripts")
public class Runner1 extends AbstractTestNGCucumberTests
{
	
}