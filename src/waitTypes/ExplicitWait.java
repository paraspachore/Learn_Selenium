package waitTypes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		driver.findElement(By.name("userName")).sendKeys("izin");
		driver.findElement(By.name("password")).sendKeys("izin");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.name("submit"))).click();

	}

}
