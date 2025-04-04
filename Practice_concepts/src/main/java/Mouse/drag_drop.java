package Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class drag_drop extends utilities.base_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			launch("https://practice.expandtesting.com/drag-and-drop");
			

			WebElement we1=dr.findElement(By.xpath("//div[@id='column-a']"));
			WebElement we2=dr.findElement(By.xpath("//div[@id='column-b']"));
			
			Actions act=new Actions(dr);
			act
				.dragAndDrop(we1, we2)
				.perform();
	}

}
