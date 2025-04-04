package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class common_methods {
	protected static WebDriver dr;
	//static String url;
	public void launch_chrome(String url){
//		dr=new ChromeDriver();
		dr=new EdgeDriver();
		dr.get(url);
	}
}
