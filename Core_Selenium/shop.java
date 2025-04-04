package Core_Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://demowebshop.tricentis.com");
		
		d.findElement(By.xpath("//a[@href='/login']")).click();
		d.findElement(By.className("email")).sendKeys("ap5800@mail.com");
		d.findElement(By.className("password")).sendKeys("abcdef");
		
		d.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
		
		d.findElement(By.xpath("//div[@class='block block-category-navigation']/div[2]//a[@href='/books']")).click();
		
		WebElement we1=d.findElement(By.name("products-orderby"));
		Select se1 = new Select(we1);
		se1.selectByContainsVisibleText("Name: A");
		
		//d.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']//div[3]")).click();

	}

}
