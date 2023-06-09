package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframEx {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"a077aa5e\"]"));
		
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//img[@src=\"Jmeter720.png\"]")).click();
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
