package Mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Workingwithlinks {
	WebDriver driver;
	int x;
	List<WebElement> links;
	@BeforeTest
	public void countnooflinks()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul Rajik shaik\\Desktop\\project\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		driver.manage().window().maximize();
			
	}
	@Test(priority=1)
	public void Pagelinks()
	{
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("total no of links are "+links.size());
		 x=links.size();
	}
	@Test(priority=2)
	public void Namesoflinks()
	
	{
      try
      {
		for(int i=0;i<x;i++)
		{
			String name= links.get(i).getText();
			System.out.println("the name of "+i+"name is"+name);
			
		}
      }
      catch(java.lang.NullPointerException exception)
      {
    	  System.out.println(exception);
      }
	}

}
