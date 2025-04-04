package Assignment_Selen;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.*;

public class login_assign extends functionss {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the User Id : ");
			String id = sc.next();
			System.out.println("Enter the password : ");
			String pwd=sc.next();
			System.out.println("Enter your msg also :");
			String msg=sc.next();
			//validlogin(id,pwd,msg);
			validlogin(id,pwd,msg);
			
		// TODO Auto-generated method stub
	
	}

}

//Epic sadface: Username and password do not match any user in this service

