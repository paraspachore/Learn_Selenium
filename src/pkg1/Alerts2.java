package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();

		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();

	}

}
