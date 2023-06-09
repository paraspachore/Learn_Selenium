package keyboardOps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownEnterKeys {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		WebElement s = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		s.sendKeys("selenium");
		
		for(int i = 0; i<4; i++) {
			Thread.sleep(2000);
			s.sendKeys(Keys.DOWN);
		}
		Thread.sleep(2000);
		s.sendKeys(Keys.ENTER);

	}

}
