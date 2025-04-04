package Test_NG;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test_suite1 {
	@Test
	public void test1() {
		WebDriver dr=new ChromeDriver();
		dr.get("https://demowebshop.tricentis.com/");
		//Launch_chrome("https://demowebshop.tricentis.com/");
		
		LocalDateTime myDateObj = LocalDateTime.now();
		DateTimeFormatter myFormatObj=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate = myDateObj.format(myFormatObj);
		System.out.println("In test1 - After formatting : "+ formattedDate);
	}
}
