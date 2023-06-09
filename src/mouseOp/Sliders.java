package mouseOp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliders {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		Actions mouse = new Actions(driver);
		
		driver.get("https://jqueryui.com/slider/");
		
//		driver.switchTo().frame(0);
		
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		
		mouse.dragAndDropBy(x, 300, 0).build().perform();
		
	}

}
