package Mypackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithdropdowns
{
	static WebDriver driver=null;
	public static void main(String args)
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Abdul Rajik shaik\\"
			+ "Desktop\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.makemytrip.com/");
	
		driver.findElement(By.xpath("//li[contains(text(),'Oneway')]")).click();
		driver.findElement(By.id("fromCity")).clear();
		driver.findElement(By.id("fromCity")).sendKeys("Bangalore");
		driver.findElement(By.id("toCity")).clear();
		driver.findElement(By.id("toCity")).sendKeys("Delhi Airport India");
		driver.findElement(By.xpath("//a[contains(@class,'primaryBtn font24 latoBlack widgetSearchBtn')]")).click();
	
		driver.close();
	}
	
}
