package newtours;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Verifylogin {
	WebDriver driver;
	WebDriverWait wait;
	@BeforeTest
	public void open()
	{
		System.setProperty("webdriver.gecko.driver", "‪C:\\Users\\Abdul Rajik shaik"
	    	  		+ "\\Downloads\\geckodriver-v0.24.0-win64 (1)\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	@Test
	public void page() throws InterruptedException, IOException
	{
		
		wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("userName")));
		driver.findElement(By.name("userName")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		Sleeper.sleepTight(5000);
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File("C:\\Users\\Abdul Rajik shaik\\Desktop\\Abdul\\Selenium\\src\\newtours\\screenshot.png"));
	}

}
