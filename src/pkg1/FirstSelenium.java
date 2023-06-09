package pkg1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://demo.guru99.com/test/newtours/");
//		
//		String str = driver.getTitle();
//		System.out.println(str);
//		
//		driver.manage().window().maximize();
//		
//		driver.findElement(By.name("userName")).sendKeys("izin");
//		driver.findElement(By.name("password")).sendKeys("izin");
//		driver.findElement(By.name("submit")).click();
//		
////		String url = driver.getCurrentUrl();
//		
//		System.out.println(driver.getCurrentUrl());
//		
////		driver.manage().window().minimize();
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();

		driver.findElement(By.name("userName")).sendKeys("izin");
		driver.findElement(By.name("password")).sendKeys("izin");

		String txt = driver.findElement(By.id("site-name")).getText();
		System.out.println(txt);
		txt = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[1]/td/font/b")).getText();
		System.out.println(txt);
		
		driver.findElement(By.name("submit")).click();
		
		String currUrl = driver.getCurrentUrl();
		System.out.println(currUrl);
		
		String str = driver.getTitle();
		System.out.println(str);
		
		
	}

}
