package Tests;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utilities.common_methods;
import pom_pages.login_page;
import pom_pages.products_page;

public class newtest extends common_methods{
	 	login_page lp;
	    products_page pp;
	    String[][] credentials;
	    
	    @BeforeClass
	    public void setup() throws IOException {
	        credentials = readExcel();
	    }
	    
	    @BeforeMethod
	    public void bm() {
	        launchchrome("https://www.saucedemo.com");
	        lp = new login_page(dr);
	        pp = new products_page(dr);
	         
}
	    
	    @Test
	    public void test1() {
	        lp.enter_username(credentials[0][0]);
	        lp.enter_pwd(credentials[0][1]);
	        lp.click_login();
	        String atitle = pp.get_title();
	        Assert.assertEquals("Products", atitle);
}
	    
	    @Test
	    public void test2() {
	        lp.enter_pwd(credentials[1][0]);
	        lp.enter_pwd(credentials[1][1]);
	        lp.click_login();
	        String atitle = pp.get_title();
	        Assert.assertEquals("Products", atitle);
	    }
	    
	    @AfterMethod
	    public void am() {
	        dr.close();
	    }
	    
	    public static String[][] readExcel() throws IOException {
	        String filename = "logindata.xlsx";
	        String sheetname = "sheet1";
	 
	        FileInputStream fis = new FileInputStream(filename);
	        XSSFWorkbook wb = new XSSFWorkbook(fis);
	        XSSFSheet sh = wb.getSheet(sheetname);
	 
	        int rowCount = sh.getPhysicalNumberOfRows();
	        String[][] data = new String[rowCount][2];
	 
	        for (int i = 0; i < rowCount; i++) {
	            XSSFRow row = sh.getRow(i);
	            XSSFCell cell1 = row.getCell(0);
	            XSSFCell cell2 = row.getCell(1);
	            data[i][0] = cell1.getStringCellValue();
	            data[i][1] = cell2.getStringCellValue();
	        }
	 
	        wb.close();
	        return data;
}
}