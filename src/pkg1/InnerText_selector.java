package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerText_selector {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login");
		String str = driver.findElement(By.cssSelector("div:contains(Log in to Facebook)")).getText();
		System.out.println(str);

	}

}
