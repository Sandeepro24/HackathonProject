package com.LoanEMI.StepRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(

		features = { "src/test/resources/Features/EMIcalculatorEndToEnd.feature",}, glue = "com.LoanEMI.StepDefinitions", plugin = {"pretty", "rerun:target/rerun.txt","html:Cucumber-reports/report.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, dryRun = false, monochrome = true)

@Test
public class TestRunner extends AbstractTestNGCucumberTests {

	public TestRunner() {
		// TODO Auto-generated constructor stub
	}

}
