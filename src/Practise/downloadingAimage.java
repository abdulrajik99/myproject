package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class downloadingAimage 
{
	WebDriver driver=null;
	@BeforeMethod
	public void set()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul Rajik shaik"
		  		+ "\\Desktop\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("https://all-free-download.com/wallpapers/cute-baby-wallpaper.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	@Test
	public void cutewallpaper()
	{
		String title= driver.getTitle();
		System.out.println("title of the page is"+title);
		driver.findElement(By.xpath("//div[15]//a[1]//img[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'1024_768')]")).click();
		
	}
}
