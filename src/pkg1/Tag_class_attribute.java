package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tag_class_attribute {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login");
		driver.findElement(By.cssSelector("input.inputtext[name=email]")).sendKeys("abc@gmail.com");

	}

}
