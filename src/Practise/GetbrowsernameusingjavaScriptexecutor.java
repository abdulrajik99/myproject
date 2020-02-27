package Practise;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetbrowsernameusingjavaScriptexecutor 
{
	static WebDriver driver;
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul Rajik shaik"
		  		+ "\\Desktop\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("http://www.google.com");
      JavascriptExecutor js = (JavascriptExecutor) driver;
      System.out.println(js.executeScript("return navigator.appCodeName"));
      String tit=driver.getTitle();
      System.out.println("title is "+tit);
      driver.close();

	}
}
