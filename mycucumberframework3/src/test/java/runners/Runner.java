package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //Path of the features folder
        features ="src/test/resources/features",
//        Path of the step definitions folder
        glue = "stepdefinitions",
        tags = "@dbtest",
//        tags ="@test1 and not @test2",
        dryRun = false,
//        plugin = "html:target/default-cucumber-reports"

        plugin = {
                "html:target/html-reports",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        }
)
public class Runner {

}