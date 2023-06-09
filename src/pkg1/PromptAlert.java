package pkg1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		
		Thread.sleep(3000);
		
		Alert prompt = driver.switchTo().alert();
		
		prompt.sendKeys("Paras");
		
//		Thread.sleep(5000);
		
		prompt.accept();
		
		
		
//		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
//		
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/section[3]/div/div[3]/div/div/div/center/button")).click();
//		
//		Thread.sleep(3000);
//		
//		Alert prompt = driver.switchTo().alert();
//		
//		prompt.sendKeys("Hello, Good morning...");
//		
//		Thread.sleep(5000);
//		
//		prompt.accept();
		
	}

}
