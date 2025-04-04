package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class average_student {
	static HashMap<Integer,studentdata> hm;
	static int sid;
	static int maths;
	static int phy;
	static String filename="student.xlsx";
	static String sheetname1="Sheet1";
	static String sheetname2="Sheet2";
	
	public static void getdata() throws IOException {
		
		String sheetname1="Sheet1";
		String sheetname2="Sheet2";
		
		
		FileInputStream fis=new FileInputStream(filename);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet(sheetname1);
		hm=new HashMap<Integer,studentdata>();
		
		int i=1,j=0;
		while(i<=3) {
			XSSFRow r=sh.getRow(i);
			studentdata sd=new studentdata((int)r.getCell(j).getNumericCellValue(),(int)r.getCell(j+1).getNumericCellValue(),(int)r.getCell(j+2).getNumericCellValue());
			hm.put(sd.sid,sd);
		}	
	}
	public static void writedata() throws IOException {
		FileInputStream fis=new FileInputStream(filename);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet(sheetname2);
		
		int i=1,sid;
		while(i<=3) {
			XSSFRow r=sh.getRow(i);
			sid=(int)r.getCell(0).getNumericCellValue();
			for(Entry<Integer,studentdata> x: hm.entrySet()) {
				if(x.getKey() == sid) {
					studentdata v=x.getValue();
					XSSFCell cell=r.createCell(3);
					cell.setCellValue(v.average());
					FileOutputStream fos=new FileOutputStream(filename);
					wb.write(fos);
					fos.close();
					break;
				}
			}
		}	
	}
		
//		for(int i=1;i<=3;i++) {
//			for(int j=0;j<3;j++) {
//				XSSFRow r=sh.getRow(i);
//				XSSFCell c=r.getCell(j);
//				sid=(int)c.getNumericCellValue();
//				maths=(int)c.getNumericCellValue();
//				phy=(int)c.getNumericCellValue();
//				studentdata sd=new studentdata(sid,maths,phy);
//				hm.put(sd.sid,sd);
//			}
//		}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		getdata();
		writedata();	
//		for(Entry<Integer,studentdata> i:hm.entrySet()) {
//			studentdata a=i.getValue();
//			System.out.println("Sid "+ a.sid + " |  maths " + a.maths + " |  physics " + a.phy);
//		}
	}

}
