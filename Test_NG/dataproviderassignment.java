package Test_NG;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderassignment extends common_methods{
		
	static String xp_p1;
	static String xp_p3;
	static String fullxp;
	static int num;
	
	@BeforeClass
	public void login() {
		launchchrome("https://www.saucedemo.com");
		dr.findElement(By.id("user-name")).sendKeys("standard_user");
		dr.findElement(By.name("password")).sendKeys("secret_sauce");
		dr.findElement(By.id("login-button")).click();
		
		 xp_p1="//div[@class ='inventory_list']/div[";
		 num=1;
		 xp_p3= "]//div[@data-test='inventory-item-name']";
	}
	
	@DataProvider(name="testdata")
	public Object[] getdata() {
		Object[] prd_names=new Object[] {
					"Sauce Labs Backpack",
					"Sauce Labs Bike Light",
					"Sauce Labs Bolt T-Shirt",
					"Sauce Labs Fleece Jacket",
					"Sauce Labs Onesie",
					"Test.allTheThings() T-Shirt (Red)"
					};
		return prd_names;
		}
	@Test(dataProvider="testdata")
	public void testing(String expname) {
		fullxp=xp_p1+num+xp_p3;
		 String a_name=dr.findElement(By.xpath(fullxp)).getText();
		 Assert.assertEquals(expname, a_name);
		 num++;	 
	}
	}
