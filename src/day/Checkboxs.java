package day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxs {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ironspider.ca/forms/checkradio.htm");
		
		driver.manage().window().maximize();
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form/input[1]"));
		WebElement y = driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form/input[5]"));
		
		Thread.sleep(3000);
		x.click();
		Thread.sleep(2000);
		y.click();
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
