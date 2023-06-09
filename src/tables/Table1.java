package tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///E:/Old%20D%20Drive/Study/EduBridge/SimpleTable.html");
		
		String data = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]")).getText();
		
		System.out.println(data);
		
		int x = driver.findElements(By.xpath("/html/body/table/tbody/tr")).size();
		System.out.println("No. of rows: "+x);
		int y = driver.findElements(By.xpath("/html/body/table/tbody/tr[1]/td")).size();
		System.out.println("No. of Columns: "+y);
		int z = driver.findElements(By.xpath("/html/body/table/tbody/tr/td")).size();
		System.out.println("No. of cells: "+z);
		
		for (int i = 1; i <= x; i++) {
			for(int j = 1; j <= y; j++) {
				System.out.print(driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText());
			}
			System.out.println();
		}
		
		
		driver.close();
	}

}
