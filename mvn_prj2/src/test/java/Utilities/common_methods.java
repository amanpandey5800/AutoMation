package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Tests.user_data;

public class common_methods {
	static HashMap<String,user_data> hm;
	protected static WebDriver dr ;
	public	static void launchchrome(String url) {
		dr =new ChromeDriver();
		dr.get(url);	
	}
	
	public void dataread()throws IOException {
		
		
		String filename="logindata.xlsx";
		String sheetname="Sheet1";
		
		FileInputStream fis=new FileInputStream(filename);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet(sheetname);
		hm=new HashMap<String,user_data>();

		
	}
}
