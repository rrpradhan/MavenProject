package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features={"src/test/resources/Features/login.feature"}, 
glue= {"StepDefinitions"},
monochrome = true,
plugin = {"pretty","junit:target/JUnitReports/report.xml",
		  "json:target/JSONReports/report.json",
		  "html:target/HtmlReports/report.html"}
//tags = "@Smoke"
//tags = "@Smoke or @Regression"
//tags = "@Smoke and @Regression"
//tags = "@Smoke and not @Regression"
//tags = "(@Smoke and @Regression) or @Important"
//FOr JUnit 5
//import io.cucumber.junit.platform.engine.Cucumber;
//import org.junit.platform.suite.api.ConfigurationParameter;
//import org.junit.platform.suite.api.SelectPackages;
//
//@Cucumber
//@SelectPackages("your.package.with.features")
//@ConfigurationParameter(key = "cucumber.filter.tags", value = "${cucumber.options}")
)
public class TestRunner {
	//This is an empty class.
}