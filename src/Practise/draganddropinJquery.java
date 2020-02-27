package Practise;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sun.jna.platform.FileUtils;

public class draganddropinJquery 
{
	WebDriver driver=null;
	Actions ac=null;
	@BeforeMethod
	public void set()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul Rajik shaik"
		  		+ "\\Desktop\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.get("https://jqueryui.com/droppable/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.manage().deleteAllCookies();
		
	}
	@Test
	public void jquery()
	{
		ac=new Actions(driver);
		List<WebElement> frame=driver.findElements(By.xpath("//iframe"));
		System.out.println("the frames are    "+frame.size());
		driver.switchTo().frame(0);
		ac.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']")))
		.moveToElement(driver.findElement(By.xpath("//div[@id='droppable']"))).release()
		.build().perform();
	    String titi= driver.getTitle();
	    System.out.println("the title is "+titi);
	    //driver.close();
	  
	}
}
