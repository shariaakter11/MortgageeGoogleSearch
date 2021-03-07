package com.testRunnar;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/*
 * connect with feature folder and stepDef package
 */
@CucumberOptions(
	features = "Features",
	glue = "com.stepDef"
		)

public class TestRunnar extends AbstractTestNGCucumberTests {

}
