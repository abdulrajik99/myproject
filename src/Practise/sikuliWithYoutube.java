package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sikuliWithYoutube 
{
	WebDriver driver=null;
	@BeforeMethod
	public void set()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul Rajik shaik"
		  		+ "\\Desktop\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/watch?v=6aWoEBxlyUg");
		driver.manage().deleteAllCookies();
		
	}
	@Test
	public void youtube() throws FindFailed
	{
		//clicking on pause button
		String titleofpage=driver.getTitle();
		JavascriptExecutor js=((JavascriptExecutor)driver);
	     String jsyoutubetitle=(String) js.executeScript("return document.title");
	     System.out.println("printing title through js"+jsyoutubetitle);
		System.out.println("before execution the title of page is "+titleofpage);
		Assert.assertEquals(titleofpage, "Extra Jabardasth | 10th January 2020 | Extra Jabardasth Latest Promo - Rashmi,Sudigali Sudheer");
		Screen s=new Screen();
		Pattern  pause=new Pattern("C:\\Users\\Abdul Rajik shaik\\Desktop\\Abdul\\Selenium\\src\\Practise\\pausebutton.PNG");
		s.wait(pause, 2000);
		s.click(pause);
		//clicking on full screen button
		Screen s2=new Screen();
		Pattern  fullscreen=new Pattern("C:\\Users\\Abdul Rajik shaik\\Desktop\\Abdul\\Selenium\\src\\Practise\\fullScreen.PNG");
		s2.wait(fullscreen, 2000);
		s2.click(fullscreen);
		String title =driver.getTitle();
		System.out.println("title of page is "+title);

		
	}
	@AfterMethod
	public void shutdown()
	{
		driver.close();
	}
}
