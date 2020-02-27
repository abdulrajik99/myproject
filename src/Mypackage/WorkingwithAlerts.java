package Mypackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingwithAlerts {
	ChromeDriver driver;
	
	@BeforeTest
	public void browser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul Rajik shaik\\Desktop\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        
	}

	@Test
	public void Homepage()
	{
		driver.get("https://tsrtconline.in/oprs-web/");
		
	}
}
