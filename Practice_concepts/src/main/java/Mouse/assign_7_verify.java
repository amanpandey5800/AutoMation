package Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.base_class;

public class assign_7_verify extends base_class {

		@BeforeMethod
		public void open() {
			launch("https://jqueryui.com/checkbox");
			WebElement w1=dr.findElement(By.xpath("//iframe[@src='/resources/demos/checkboxradio/default.html']"));
			
			dr.switchTo().frame(w1);
		}
		
		@Test
		public void test1() {
			String b=dr.findElement(By.xpath("//div[@class='widget']//h2[2]")).getText();
			Assert.assertEquals(b,"Checkbox");
		}

}
