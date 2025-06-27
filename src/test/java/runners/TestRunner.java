package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepDefinitions", "hooks"},
        tags = "@TC001 or @TC002 or @TC003 or @TC004 or @TC005 or @TC006",
        		
        plugin = {
        				"pretty", 
        				"html:test-output/reports/cucumber-report.html"
        			},
        monochrome = true
)
public class TestRunner {
}
