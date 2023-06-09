package pkg1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alertspg {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.diver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		Actions act = new Actions(driver);

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement DCbtn = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));

		act.doubleClick(DCbtn).perform();
		
		Alert alertBox = driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		alertBox.accept();

	}

}
