package Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class assign_8 extends utilities.base_class{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		launch("https://www.saucedemo.com/");
		WebElement w1=dr.findElement(By.xpath("//input[@id='login-button']"));
		
		JavascriptExecutor jse=(JavascriptExecutor) dr;
		jse.executeScript("arguments[0].click()",w1);
		

	}

}
