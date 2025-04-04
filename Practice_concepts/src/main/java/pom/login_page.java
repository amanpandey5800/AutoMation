package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {
	
	WebDriver dr;
	
	@FindBy(xpath="https://input[@id='user-name']")
	WebElement userid;
	
	@FindBy(xpath="https://input[@id='password']")
	WebElement pwd;
	
	@FindBy(xpath="https://input[@id='login-button']")
	WebElement log;
	
	public login_page(WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr,this);
	}
	
	public void enter_user(String username) {
		userid.sendKeys(username);
	}
	
	public void enter_pass(String pd) {
		pwd.sendKeys(pd);
	}
	public void click() {
		log.click();
	}
	

}
