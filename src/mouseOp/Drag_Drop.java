package mouseOp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		Actions mouse = new Actions(driver);
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement y = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		mouse.dragAndDrop(x, y).perform();
//		mouse.dragAndDrop(x, y).build().perform();

	}

}
