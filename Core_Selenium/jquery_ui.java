package Core_Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class jquery_ui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://jqueryui.com");
		//d.findElement(By.xpath("//a[@href='https://jqueryui.com/checkboxradio/']")).click();
		d.findElement(By.xpath("//*[text()='Checkboxradio']")).click(); 
		//  //*[text()="checkboxradio"]
		//  //*[contains(text(),'radio')]
		
		//d.findElement(By.xpath("//div[@class='widget']//fieldset[1]/label[1]/span[1]")).click();
		WebElement we1=d.findElement(By.xpath("//iframe[@class = 'demo-frame']"));
		d.switchTo().frame(we1);
		
		d.findElement(By.xpath("//label[@for='radio-1']/span[1]")).click();
		
		d.findElement(By.xpath("//label[@for='checkbox-1']/span[1]")).click();
		
		d.findElement(By.xpath("//label[@for='checkbox-nested-1']/span[1]")).click();
		
	}

}
