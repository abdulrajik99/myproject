package Mypackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Explicitywait {
	ChromeDriver driver=null;
	WebDriverWait wait=null;
	@BeforeTest
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul Rajik shaik\\Desktop\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
        driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Gmail")));
		}

	@Test
	public void operation()
	{
		driver.findElement(By.linkText("Gmail")).click();
		String x=driver.getTitle();
		System.out.println("the title is "+x);
		String y=driver.getCurrentUrl();
		System.out.println("the url is "+y);
		String z=driver.getPageSource();
		System.out.println("the page source is "+z);
		String a=driver.getWindowHandle();
		System.out.println("the window handle is "+a);
		
	}
}
