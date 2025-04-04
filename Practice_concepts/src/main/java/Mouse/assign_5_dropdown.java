package Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class assign_5_dropdown extends utilities.base_class {
	public static void main(String[] args) {
		launch("https://jqueryui.com/selectmenu/");
		
		WebElement w1=dr.findElement(By.xpath("//iframe[@src='/resources/demos/selectmenu/default.html']"));
		
		dr.switchTo().frame(w1);
		
		WebElement w2=dr.findElement(By.xpath("//span[@id='speed-button']"));
//		we.click();
		Select s1=new Select(w2);
		s1.selectByIndex(0);
		
		WebElement w3=dr.findElement(By.xpath("//span[@id='number-button']"));
		Select s2=new Select(w3);
		s2.selectByValue("4");
	}

}
