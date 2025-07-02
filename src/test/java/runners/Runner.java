package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:Features",
		glue = {"steps"},
		tags = {"@end2End"},
		plugin = {"pretty", "html:target/cucumber-reports","io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"},
		monochrome = true,
		dryRun = false
)
public class Runner {
}
