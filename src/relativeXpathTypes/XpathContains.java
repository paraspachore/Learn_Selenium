package relativeXpathTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContains {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/");

		driver.findElement(By.xpath("//*[contains(@type='text')]")).sendKeys("izin");
		driver.findElement(By.xpath("//*[contains(@type,'password')]")).sendKeys("izin");
		driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();
	}

}
