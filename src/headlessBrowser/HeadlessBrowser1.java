package headlessBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser1 {

	public static void main(String[] args) {
		
		
		ChromeOptions options = new ChromeOptions();
//		chromeOptions.setHeadless(true);
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		
		
		driver.get("https://www.facebook.com");
		String title = driver.getTitle();
		System.out.println(title);

	}

}
