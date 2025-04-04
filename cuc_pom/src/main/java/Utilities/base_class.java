package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base_class {
	protected static WebDriver dr ;
	public	static void launchchrome(String url) {
		dr =new ChromeDriver();
		dr.get(url);	
	}
}
