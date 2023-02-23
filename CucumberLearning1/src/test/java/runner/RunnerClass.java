package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFile",
glue= {"stepdefinition"},
//glue={"stepdefinition","TaggedHooks"} ,
//dryRun = true,
monochrome = true,
plugin = {"html:report/WebReport.html" , "json:report/jsonreport.json", 
		"junit:report/xmlreport.xml"},
//tags = { "@DataDriven,@Logintest"}
//tags= {"~@Logintest"}  //it will check all other except Logintest
tags ={"@Logintest","@DataDriven"}
//name = {"background"} //it will look for name in scenario
)

public class RunnerClass {
	
	//combine feature file and step definition
	//runner define
	
	


}
