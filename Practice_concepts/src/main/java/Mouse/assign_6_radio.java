package Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class assign_6_radio extends utilities.base_class{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		launch("https://jqueryui.com/checkboxradio/");
		
		WebElement w1=dr.findElement(By.xpath("//iframe[@src='/resources/demos/checkboxradio/default.html']"));
		dr.switchTo().frame(w1);
		
		dr.findElement(By.xpath("//label[@for='radio-3']")).click();
		
		dr.findElement(By.xpath("//label[@for='checkbox-3']")).click();

		dr.findElement(By.xpath("//label[@for='checkbox-4']")).click();

	}

}
