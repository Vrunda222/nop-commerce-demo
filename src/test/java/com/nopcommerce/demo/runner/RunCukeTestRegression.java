package com.nopcommerce.demo.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//feature paths is from content root, glue path is from source root
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/nopcommerce/demo/steps",
        plugin = {"html:target/cucumber-reports/cucumber.html",
                //extend report plugin
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                //jason cucumber plugin
                "json:target/cucumber-reports/cucumber.json"},
        tags = "@regression"
)
public class RunCukeTestRegression extends AbstractTestNGCucumberTests {



}
