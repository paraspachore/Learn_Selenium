package relativeXpathTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathStartsWith {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/");

		driver.findElement(By.xpath("//*[starts-with(@name,'userName')]")).sendKeys("izin");
		driver.findElement(By.xpath("//*[starts-with(@name,'password')]")).sendKeys("izin");
		driver.findElement(By.xpath("//*[starts-with(@name,'submit')]")).click();

	}

}
