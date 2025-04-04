package Test_NG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample extends common_methods{
	
	
	@DataProvider(name="logindata")
	public Object[][] getdata()
	{
		Object [][] testdata=new Object[][]
											{
							{"user1","pwd1"},				
							{"user1","pwd1"},				
							{"user1","pwd1"},				
							{"user1","pwd1"},				
							{"user1","pwd1"}
					};
					return testdata;				
	}
	@Test(dataProvider = "logindata")
	public void testlogin(String uid,String pwd) {
		System.out.println("User id" + uid + " Password : "+ pwd);
	}
}
