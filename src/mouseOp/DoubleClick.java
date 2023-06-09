package mouseOp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		Actions act = new Actions(driver);
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement DCbtn = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		
		act.doubleClick(DCbtn).perform();

	}

}
