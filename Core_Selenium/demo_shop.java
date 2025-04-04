package Core_Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class demo_shop {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://demowebshop.tricentis.com");
		
		d.findElement(By.className("ico-login")).click();
		d.findElement(By.id("Email")).sendKeys("ap5800@mail.com");
		d.findElement(By.name("Password")).sendKeys("abcdef");
		d.findElement(By.className("login-button")).click();
		
		String s =d.findElement(By.xpath("//a[@class='account']")).getText();
		
		System.out.println("Lets check the mail id ");
		
		if(s.equals("ap5800@mail.com")) {
			System.out.println("right showing");
			
		}else {
			System.out.println("Wrong Showing");
		}
		
//		d.findElement(By.className("product-box-add-to-cart-button")).click();
		d.findElement(By.xpath("//input[@type='button']")).click();
		
		d.findElement(By.xpath("//input[@class='recipient-name']")).sendKeys("John");
		//d.findElement(By.className("recipient-name")).sendKeys("John");
		//d.findElement(By.className("recipient-email")).sendKeys("ak5800@mail.com");
		d.findElement(By.xpath("//input[@class='recipient-email']")).sendKeys("a121@gmail.com");
		d.findElement(By.id("add-to-cart-button-2")).click();
		
		
	}

}

//<input type="button" value="Add to cart" class="button-2 product-box-add-to-cart-button" onclick="AjaxCart.addproducttocart_catalog('/addproducttocart/catalog/31/1/1    ');return false;">