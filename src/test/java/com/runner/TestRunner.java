package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.stepdefinition.JvmReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "\\src\\test\\resources" }, glue = {"com.stepdefinition" }, monochrome = true,plugin= {"json:reports\\JVMreport.json"})
public class TestRunner {
	@AfterClass
	public static void reportGeneration() {
		JvmReport.generateReport("reports\\JVMreport.json");

	}
	
}
