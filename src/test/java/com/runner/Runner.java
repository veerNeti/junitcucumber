package com.runner;

/*import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;*/


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"src/test/resources/feature/sample.feature"},
        monochrome = true,
        plugin =
                {"pretty",
                        "json:target/cucumber_json_reports/home-page.json",
                        "html:target/home-page-html"
                },
        glue = {"com.steps"})
public class Runner {
}
