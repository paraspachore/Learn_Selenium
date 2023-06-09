package relativeXpathTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathText {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/");

		String txt = driver.findElement(By.xpath("//*[text()='Password:']")).getText();
		
		System.out.println(txt);

	}

}
