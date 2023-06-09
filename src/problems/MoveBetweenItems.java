package problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveBetweenItems {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://selenium-apps.doselect.in/mibe/");
		Actions mouse = new Actions(driver);
        WebElement one = driver.findElement(By.xpath("//*[contains(text(),'One')]"));
        mouse.click(one).perform();
        WebElement addButton = driver.findElement(By.className("adding"));
        mouse.click(addButton).perform();
        WebElement two = driver.findElement(By.xpath("//*[contains(text(),'Two')]"));
        mouse.click(two).perform();
        WebElement removeButton = driver.findElement(By.className("removing"));
        mouse.click(removeButton).perform();
		Thread.sleep(5000);
		driver.quit();
		
		
		
//		driver.get("https://selenium-apps.doselect.in/mibe/");
//		Thread.sleep(3000);
//		WebElement one = driver.findElement(By.xpath("//*[contains(text(),'One')]"));
//		one.click();
//		Thread.sleep(2000);
//		WebElement addButton = driver.findElement(By.cssSelector("span.adding[data-value='add']"));
//		addButton.click();
//		Thread.sleep(2000);
//		WebElement two = driver.findElement(By.xpath("//*[contains(text(),'Two')]"));
//		two.click();
//		Thread.sleep(2000);
//		WebElement removeButton = driver.findElement(By.cssSelector("span.removing[data-value='remove']"));
//		removeButton.click();
//		Thread.sleep(2000);

//		driver.get("https://selenium-apps.doselect.in/mibe/");
//		WebElement one = driver.findElement(By.xpath("//*[contains(text(),'One')]"));
//		one.click();
//		WebElement addButton = driver.findElement(By.cssSelector("span.adding[data-value='add']"));
//		addButton.click();
//		WebElement two = driver.findElement(By.xpath("//*[contains(text(),'Two')]"));
//		two.click();
//		WebElement removeButton = driver.findElement(By.cssSelector("span.removing[data-value='remove']"));
//		removeButton.click();

//        driver.get("https://selenium-apps.doselect.in/mibe/");
//        WebElement one = driver.findElement(By.xpath("//*[contains(text(),'One')]"));
//        one.click();
//        WebElement addButton = driver.findElement(By.cssSelector("span.adding[data-value='add']"));
//        addButton.click();
//        WebElement two = driver.findElement(By.xpath("//*[contains(text(),'Two')]"));
//        two.click();
//        WebElement removeButton = driver.findElement(By.cssSelector("span.removing[data-value='remove']"));
//        removeButton.click();

//        driver.get("https://selenium-apps.doselect.in/mibe/");
//        WebElement one = driver.findElement(By.xpath("//*[contains(text(),'One')]"));
//        one.click();
//        List<WebElement> addButtonList = driver.findElements(By.className("adding"));
//        WebElement addButton = addButtonList.get(0);
//        addButton.click();
//        WebElement two = driver.findElement(By.xpath("//*[contains(text(),'Two')]"));
//        two.click();
//        List<WebElement> removeButtonList = driver.findElements(By.className("removing"));
//        WebElement removeButton = removeButtonList.get(0);
//        removeButton.click();
	}

}
