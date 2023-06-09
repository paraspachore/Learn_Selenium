package mouseOp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		
		Actions mouse = new Actions(driver);
		
		mouse.contextClick(x).perform();
		
	}

}
