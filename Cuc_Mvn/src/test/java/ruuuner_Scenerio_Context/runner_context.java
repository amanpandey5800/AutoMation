package ruuuner_Scenerio_Context;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src//test//resource//loginscenerio"},
							glue= {"stefdef_scenerio_context"},
							plugin= {"pretty","html:target/htmlreports/report.html"},
							tags="@set2"
							)

public class runner_context extends AbstractTestNGCucumberTests {
		
}

