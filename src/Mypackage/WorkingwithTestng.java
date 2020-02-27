package Mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingwithTestng {
	ChromeDriver driver;
	@BeforeTest
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul Rajik shaik\\Desktop\\project\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://www.google.com/");
        driver.manage().window().maximize();
	}
	@Test
	public void login()
	{
		driver.get("https://www.edmodo.com/");
		driver.findElement(By.linkText("Login")).click();
	}
	

}
