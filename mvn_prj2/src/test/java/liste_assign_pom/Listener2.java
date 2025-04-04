package liste_assign_pom;


import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener2  implements ITestListener {
//	WebDriver dr=new ChromeDriver();
	
	common_methods cm;
	
	@Override
	public void onTestFailure(ITestResult result)  {
		cm=new common_methods();
		Reporter.log("On Test Failure " + result.getName());
		try {
			cm.ss();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override 
	public void onTestSuccess(ITestResult result){
		Reporter.log("Test Success : " + result.getName());
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Test Started : "+ result.getName());
	}
}
