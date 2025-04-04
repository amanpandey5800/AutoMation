package liste_assign_pom;

import java.io.File;
//import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Tests.user_data;

public class common_methods {
	protected static WebDriver dr ;
	public	static void launchchrome(String url) {
		dr =new ChromeDriver();
		dr.get(url);	
	}
	public void ss() throws IOException {
		TakesScreenshot ss=((TakesScreenshot) dr);
		File srcf =ss.getScreenshotAs(OutputType.FILE);
		File destfile = new File("C:\\Users\\aman.pandey\\Desktop\\files\\5.png");
		FileUtils.copyFile(srcf, destfile);
	}
	

}
