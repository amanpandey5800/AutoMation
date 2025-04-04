package stepdef_scenerio_context;

//import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Scenerio_contxt;
import utilities.Test_Context;

public class LoginSteps  {
	
	Test_Context tContext;

	@When("")	
	
	
	
//	@When("^User enters  \"(.*)\" and \"(.*)\"$")
//	public void user_enters_and(String string, String string2) {
//		tContext =new Test_Context();
//		System.out.println("User enters valid username and password");
//		tContext.set(Scenerio_contxt.USERNAME.toString(), string);
////		tContext.set("uname", uid);
//		
//		tContext.set(Scenerio_contxt.SESSION_TOKEN.toString(), "asd789");
////		tContext.set("Session_token", "asd789");
//	    
//	}

	@Then("User action will be displayed")
	public void user_action_will_be_displayed() {
		String storeuid=(String) tContext.get(Scenerio_contxt.USERNAME.toString());
		String sessionToken=(String) tContext.get(Scenerio_contxt.SESSION_TOKEN.toString());
		System.out.println("Storeuid : " + storeuid + "\n sessionToken : "+ sessionToken);
		
	    	}
	
	
}
