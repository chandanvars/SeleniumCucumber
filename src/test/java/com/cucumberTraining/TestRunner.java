package com.cucumberTraining;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.cucumberTraining.stepDefinitions"},
        tags = "@Scenario1",
        plugin = {"pretty", "html:target/cucumber/report.html", "json:target/cucumber/report.json"}
)
public class TestRunner {
}
