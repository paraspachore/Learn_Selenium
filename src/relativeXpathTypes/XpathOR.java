package relativeXpathTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathOR {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/");

		driver.findElement(By.xpath("//*[@type='text'or@name='userName']")).sendKeys("izin");
		driver.findElement(By.xpath("//*[@type='password'or@name='password']")).sendKeys("izin");
		driver.findElement(By.xpath("//*[@type='submit'or@name='submit']")).click();

	}

}
