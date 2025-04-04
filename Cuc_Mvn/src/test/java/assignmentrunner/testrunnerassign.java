package assignmentrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src//test//resource//FeaturesAssign"},
					glue={"stepdef_assignment"},
					plugin= {"pretty","html:target/htmlreports/report.html"},
					tags="@f1"
)


public class testrunnerassign extends AbstractTestNGCucumberTests {

}

