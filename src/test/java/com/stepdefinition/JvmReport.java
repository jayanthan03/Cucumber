package com.stepdefinition;

import java.io.File;
import java.util.ArrayList;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
public static void generateReport(String json) {
		File f = new File("reports\\JVMreport");
		Configuration c = new Configuration(f, "Adactin Report");
		c.addClassifications("platform", "windows");
		c.addClassifications("browser", "chrome");
		c.addClassifications("version", "79.0");
		c.addClassifications("sprint", "18");
		ArrayList<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(json);
		ReportBuilder r = new ReportBuilder(jsonFiles, c);
		r.generateReports();

		}

}
