package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-cucumber-reports",
                "json:target/json-reports/cucumber-regression.json",
                "junit:target/xml-report/cucumber-regression.xml"
        },
        //plugin = "html:target\\default-cucumber-reports",
        features ="src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@regression",
        dryRun = false
)
public class RegressionTestRunner {
}
