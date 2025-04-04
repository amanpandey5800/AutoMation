package Mouse;

import org.openqa.selenium.By;

public class read_xpath extends utilities.base_class{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch("https://practice.expandtesting.com/large");
		
		String a=dr.findElement(By.xpath("//tr[@class='row-20']//td[10]")).getText();
		System.out.println(a);
	}

}
