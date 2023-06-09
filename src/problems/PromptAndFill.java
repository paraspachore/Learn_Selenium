package problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAndFill {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://selenium-apps.doselect.in/jquery-alertable/");
		driver.findElement(By.xpath("/html/body/button[5]")).click();
		driver.findElement(By.xpath("/html/body/form/div[2]/input[1]")).sendKeys("johndoe");
		driver.findElement(By.xpath("/html/body/form/div[2]/input[2]")).sendKeys("foobar");
		driver.findElement(By.xpath("/html/body/form/div[2]/label/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/form/div[3]/button[2]")).click();
		

	}

}
