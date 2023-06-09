package problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AgeCalculator {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://selenium-apps.doselect.in/age-calculator/");
        driver.findElement(By.id("birth_date")).sendKeys("12/01/1998");
        driver.findElement(By.id("calculate")).click();
        driver.findElement(By.xpath("//*[@id='birth_date']")).sendKeys("12/01/1998");
        driver.findElement(By.xpath("//*[@id='calculate']")).click();

	}

}
