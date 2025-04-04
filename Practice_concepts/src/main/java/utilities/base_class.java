package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class base_class {
	protected static WebDriver dr;
//	String url;
	public static void launch(String url) {
		dr=new ChromeDriver();
		dr.get(url);
		dr.manage().window().maximize();
	}
}
