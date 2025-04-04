package stepdef_assignment;

import java.awt.Desktop.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logintestassign extends utilities.common_methods{
	

	String a ;

	@When("^click the login$")
	public void click_the_login() {
	    
		dr.findElement(By.xpath("//div[@class='header-links']//a[@href='/login']")).click();
		dr.manage().window().maximize();
	}
	
	
	@When("enter the id")
	public void userid() {
		dr.findElement(By.id("Email")).sendKeys("ap5800@mail.com");
	}
	
	@When("enter the password")
	public void passw() {
		dr.findElement(By.xpath("//input[@id='Password']")).sendKeys("abcdef");
	}
	
	@When ("click the log in")
	public void logg() {
		dr.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}
	
	
	@When("go to the books")
	
	public void clickk() {
		dr.findElement(By.xpath("//li[@class='inactive']/a[@href='/books']")).click();
	}
	
	
	
	@When("click the add for item1")
	
	public void fir() throws InterruptedException {
		dr.findElement(By.xpath("//div [@class='product-grid']/div[1]//input[@type='button']")).click();
		a=dr.findElement(By.xpath("//div [@class='product-grid']/div[1]//h2[1]/a")).getText();
		
		Thread.sleep(2000);
		
		dr.findElement(By.xpath("//div [@class='product-grid']/div[3]//input[@type='button']")).click();
		
	}
	
	
	@When("click the shopping")
	public void shop() throws InterruptedException {
		dr.findElement(By.xpath("//span[@class='cart-qty']")).click();
		
		Thread.sleep(10000);
		
	}
	
	@When("add and delete items")
	public void upda() throws InterruptedException {
//		Thread.sleep(1000);
		WebElement wa=dr.findElement(By.xpath("//tr[@class='cart-item-row'][1]//td[@class='qty nobr']/input"));
		
		Actions a=new Actions(dr);
		a.doubleClick(wa);
		a
			.sendKeys(wa,"5")
//			.sendKeys("20")
			.perform();
		
		//		a
//			.sendKeys(wa)
//			.keyDown(Keys.CONTROL)
//			.sendKeys("a")
//			.sendKeys("4")
//			.perform();
		
		dr.findElement(By.xpath("//input[@name='updatecart']")).click();
	}
	
	
	
	
	@When("correct item")
	public void testt() {
//		n=new logintestassign();
//		String b=n.a;
		String c=dr.findElement(By.xpath("//td [@class='product']//a[@href='/computing-and-internet']")).getText();
		Assert.assertEquals(a,c);
		System.out.println("Same product");
	}
	
	@When("click the i agree box")
	public void box() {
		dr.findElement(By.xpath("//input[@id='termsofservice']")).click();
	}
	
	@When("select country")
	public void country() {
		WebElement we1=dr.findElement(By.xpath("//select[@id='CountryId']"));
		Select s1=new Select(we1);
		s1.selectByVisibleText("India");
		
		dr.findElement(By.id("ZipPostalCode")).sendKeys("202001");
	
	}
	
	@When("Click checkout")
	public void checking() {
		dr.findElement(By.id("checkout")).click();
	}
	
	@When("entering details")
	public void detailss() throws InterruptedException {
		Thread.sleep(1000);
//		dr.findElement(By.id("BillingNewAddress_Company")).sendKeys("abc");
//		
//		WebElement w2=dr.findElement(By.id("BillingNewAddress_CountryId"));
//		Select s2=new Select(w2);
//		
//		s2.selectByVisibleText("United States");
//		
//		Thread.sleep(2000);
//		WebElement w3=dr.findElement(By.id("BillingNewAddress_StateProvinceId"));
//		Select s3=new Select(w3);
//		s3.selectByVisibleText("Arizona");
//		
//		WebElement w4=dr.findElement(By.id("BillingNewAddress_City"));
//		Actions act=new Actions(dr);
//		act 
//			.sendKeys(w4,"abc")
//			.keyDown(Keys.TAB)
//			
//			.sendKeys("abcdefgh")
//			.keyDown(Keys.TAB)
//			.sendKeys("sdfghdsh")
//			.keyDown(Keys.TAB)
//			.sendKeys("54646")
//			.keyDown(Keys.TAB)
//			.sendKeys("5555")
//			.keyDown(Keys.TAB)
//			.sendKeys("7547478484")
//			.perform();
//					
		dr.findElement(By.xpath("//div[@id='billing-buttons-container']/input")).click();
	}
	@When("other details")
		public void other() throws InterruptedException {
		
			Thread.sleep(1000);
//			
//			Alert act=dr.switchTo().alert();
//			act.dismiss();
			
			dr.findElement(By.id("PickUpInStore")).click();
			Thread.sleep(1000);

			dr.findElement(By.xpath("//div[@id='shipping-buttons-container']//input")).click();
			Thread.sleep(1000);
			
			dr.findElement(By.id("paymentmethod_0")).click();
			Thread.sleep(1000);
			
			dr.findElement(By.xpath("//div[@id='payment-method-buttons-container']//input")).click();
			Thread.sleep(1000);
			
			dr.findElement(By.xpath("//div[@id='payment-info-buttons-container']//input")).click();
			Thread.sleep(1000);
			

			dr.findElement(By.xpath("//div[@id='confirm-order-buttons-container']//input")).click();
//			Thread.sleep(1000);
//			dr.findElement(By.className("button-1 confirm-order-next-step-button")).click();
			
			
		}
	
	
	@Then("login successful")
	public void then() {
		System.out.println("Login success");
	}
	
}
