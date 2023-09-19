package com.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\Automation Workspace\\Gmail\\src\\test\\resources\\features\\OrangeHRM.feature",name = {"AddEmployee","EditEmployee","DeleteEmployee"},plugin="html:ExecutionReport.html")
public class TestRunner extends AbstractTestNGCucumberTests{

}
