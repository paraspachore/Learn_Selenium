package pkg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Displayed_enabled {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		
		if(email.isDisplayed()&&email.isEnabled()) {
			email.sendKeys("abc@gmail.com");
		}

	}

}
