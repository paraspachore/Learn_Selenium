package takeScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.in");
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Files.copy(f,new File( "C:\\Users\\Paras Pachore\\eclipse-workspace\\Learn_Selenium\\files\\SeleniumScreenshot.jpg"));
		
		driver.close();

	}

}
