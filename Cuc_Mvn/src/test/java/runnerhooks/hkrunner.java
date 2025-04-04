package runnerhooks;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src//test//resource//Featureshkps"},
						glue= {"hookstepdef"},
						plugin= {"pretty","html:target/htmlreports/report.html"},
						tags="@fea1"
						)

public class hkrunner extends AbstractTestNGCucumberTests{
	
		
}