package Mouse;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class waittt extends utilities.base_class {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
			launch("https://practice.expandtesting.com/slow");
			
			Wait<WebDriver> wt=new FluentWait<WebDriver>(dr)
					.withTimeout(Duration.ofSeconds(12))
					.pollingEvery(Duration.ofSeconds(7))
					.ignoring(NoSuchElementException.class);
			
			WebElement we=wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[@class='alert alert-info']//strong")));
			String s=we.getText();
			System.out.println(s);
	}

}
