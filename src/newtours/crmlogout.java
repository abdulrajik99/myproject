package newtours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class crmlogout
{
	static WebDriver driver=null;
	static Actions ac=null;
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul Rajik shaik"
		  		+ "\\Desktop\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.name("email")).sendKeys("abdulrajik5@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Crm@123456");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		System.out.println("title of page is"+driver.getTitle());
		WebElement logout=driver.findElement(By.xpath("//div[@class='ui active visible basic button floating item dropdown']"));
		logout.click();
		driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
	}
}
