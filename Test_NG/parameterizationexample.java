package Test_NG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterizationexample {


	public void test1()
	{
		System.out.println("Runnig tests on OS: ");
	}
	
	@Test
	@Parameters({"OS"})
	public void testWithParameters(String OS) {
		System.out.println("Runnig tests on OS: " + OS);
	}


}
