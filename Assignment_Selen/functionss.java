package Assignment_Selen;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class functionss {
	
	public static void validlogin(String id, String pwd,String msg) {
	WebDriver d=new ChromeDriver();
	d.get("https://www.saucedemo.com");
	
	d.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(id);
	d.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
	d.findElement(By.xpath("//input[@type='submit']")).click();
	
	
	
	String s=d.findElement(By.xpath("//span[@class='title']")).getText();
	
	System.out.println("Text Read = "+s);
	
	
	if(s.equals(msg)) {
		System.out.println("Test Case Pass ");
	}
	else  {
		
		System.out.println("Test Case Fail");
	}
}
	
	public static void invalidlogin(String id, String pwd,String msg) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.saucedemo.com");
		
		d.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(id);
		d.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
		d.findElement(By.xpath("//input[@type='submit']")).click();
		
		String s=d.findElement(By.xpath("//h3[@data-test='error']")).getText();
		System.out.println(s);
		if(s.equals(msg)) {
			System.out.println("Test Case Pass ");
		}
		else  {
			System.out.println("Test Case Fail");
		}
	}
}