package Mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Gmailxpath {
	WebDriver driver;

	@BeforeTest
	 void Gmaillogin()
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul Rajik shaik\\Desktop\\project\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
	}
	@Test
	 void OrangeHrm()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	
}
