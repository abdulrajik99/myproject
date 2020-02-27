package Mypackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Launching {
	ChromeDriver driver=null;
	@BeforeMethod
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul Rajik shaik\\Desktop\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
        driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("https://tsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void operation()
	{
		driver.findElement(By.id("searchBtn")).click();
		driver.switchTo().alert();
		driver.manage().timeouts().implicitlyWait(10 ,TimeUnit.SECONDS);
		String data=driver.switchTo().alert().getText();
		System.out.println(data);
		driver.switchTo().alert().accept();
		//method overriding(methods with same name and same parameter list
		//this can be overcome by inheritance by using extends key word
	}

}
