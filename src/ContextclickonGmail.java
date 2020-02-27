import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContextclickonGmail 
{
	WebDriver driver=null;
	Actions ac=null;
	 @BeforeMethod
	 public void timesetup()
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul Rajik shaik"
			  		+ "\\Desktop\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
	 }
	 @Test
	 public void contex()
	 {
		 ac=new Actions(driver);
		 WebElement gm=  driver.findElement(By.xpath("//a[contains(text(),'Gmail')]"));
		 ac.contextClick(gm)
		 .build()
		 .perform();
		 String text=driver.getTitle();
		 System.out.println("title is  "+text);
		 driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	 }
	 @AfterMethod
	 public void smash()
	 {
		 driver.close();
	 }
}
