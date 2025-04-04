package Mouse;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class assign1 extends utilities.base_class {
	public static void main(String[] args) {
	launch("https://practice.expandtesting.com/context-menu");
	
	WebElement w1=dr.findElement(By.xpath("//div[@id='hot-spot']")); 
	Actions act=new Actions(dr);
	act.contextClick(w1).perform();
	
	Alert a=dr.switchTo().alert();
	String b=a.getText();
	System.out.println(b);
	a.accept();
}
	
}
