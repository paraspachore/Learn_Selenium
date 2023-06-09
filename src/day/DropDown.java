package day;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		
		WebElement drpdwn = driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]"));
		
		Select selector = new Select(drpdwn);
		
//		selector.selectByVisibleText("Amazon Devices");		
//		WebElement searchbox = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
//		searchbox.sendKeys("smart speakers");
//		searchbox.sendKeys(Keys.ENTER);
//		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
//		Thread.sleep(5000);
//		driver.close();

		
		
		
		
		
		
//		selector.selectByIndex(16);
//		
//		WebElement searchbox = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
//		searchbox.sendKeys("solar power");
//		searchbox.sendKeys(Keys.ENTER);
//		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[7]/div/div/div/div/div[2]/div[1]/h2/a/span")).click();
//		Thread.sleep(5000);
//		driver.close();

		
		
		
		
		
		selector.selectByValue("search-alias=stripbooks");
		
		WebElement searchbox = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		searchbox.sendKeys("harry potter");
		searchbox.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/div/div/div[3]/div[1]/h2/a/span")).click();
		Thread.sleep(5000);
		driver.close();
		
		

	}

}
