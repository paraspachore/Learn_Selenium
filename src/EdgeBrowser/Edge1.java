package EdgeBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Edge1 {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		
//		WebDriver driver = new FirefoxDriver();
		driver.get("https://facebook.com");

	}

}
