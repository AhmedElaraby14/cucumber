package runners;

import io.cucumber.testng.CucumberOptions;
import tests.BaseTests;
@CucumberOptions(features = "G:/untitled/cucumber/src/test/java/features"
        ,glue = {"stepDefinitons"}
        ,plugin = {"pretty","html:target/cucumber-html-report"})

public class TestRunner extends BaseTests {


}
