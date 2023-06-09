package problems;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestTodoApp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://selenium-apps.doselect.in/to-do-list/");
		
		WebElement inp = driver.findElement(By.xpath("/html/body/div/form/input"));
		WebElement add = driver.findElement(By.id("button"));
		inp.sendKeys("TaskOne");
		add.click();
		inp.sendKeys("TaskTwo");
		add.click();
		inp.sendKeys("TaskThree");
		add.click();
		
		Thread.sleep(3000);
		
		Actions mouse = new Actions(driver);
		
		WebElement t2 = driver.findElement(By.xpath("//*[contains(text(),'TaskTwo')]"));
		
		mouse.doubleClick(t2).perform();
		
		

	}

}
