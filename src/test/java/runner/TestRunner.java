package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( tags = "@smoke and @auto",
				 features = {"src/test/java/features"},
				 glue = {"baseUtil","stepdef"},
				 monochrome = true,
				 dryRun = false,
				 plugin={"pretty","html:target/report.html","json:target/report_json.jason","junit:target/junit_report.xml"})


public class TestRunner {
	

}
