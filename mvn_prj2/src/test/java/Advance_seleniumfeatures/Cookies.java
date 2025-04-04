package Advance_seleniumfeatures;

import org.openqa.selenium.Cookie;

public class Cookies extends Utilities.common_methods {

	
		public static void addcookie(String cname,String cvalue) {
			Cookie c=new Cookie(cname,cvalue);
			dr.manage().addCookie(c);
			
		}
		
		public static void display() {
			for(Cookie c: dr.manage().getCookies()) {
				System.out.println("name :  | " + c.getName() + "| Value : " + c.getValue());
				
			}
		}
		
		public static void delete_cookies(String cname) {
			dr.manage().deleteCookieNamed(cname);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		launchchrome("https://www.flipkart.com");
		addcookie("UserSession","12334");
		addcookie("Place","Bangalore");
		addcookie("Page","Products Page");
		
		display();
		delete_cookies("Place");
		
		if(dr.manage().getCookieNamed("Place") == null) {
			System.out.println("TestCookie successfully deleted");
		}else {
			System.out.println("Not deleted");
		}
		
	}

}
