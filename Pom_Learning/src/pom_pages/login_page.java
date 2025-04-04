package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {
	WebDriver dr;
	
	@FindBy(xpath="//input[@id='user-name']")
	WebElement unameexp;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement pwdxp;
	
	@FindBy(xpath="//input[@id='login-button']")
	WebElement btn;
	
	
	public login_page(WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr,this);
	}
	
	public void enter_username(String un) {
		unameexp.sendKeys(un);
	}
	
	
	public void enter_pwd(String pwd) {
		pwdxp.sendKeys(pwd);
	}
	
	
	public void click_login() {
		btn.click();
	}

}
