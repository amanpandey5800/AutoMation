package Test_NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class common_methods {
	static WebDriver dr ;
	public void launchchrome(String url) {
		dr =new ChromeDriver();
		dr.get(url);
		
	}

}
