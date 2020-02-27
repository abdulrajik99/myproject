import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GmailloginusingJavascriptexe
{
	WebDriver driver=null;
	 @BeforeMethod
	 public void timesetup()
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul Rajik shaik"
			  		+ "\\Desktop\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://ui.freecrm.com/");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
	 }
	 
	 @Test 
	 public void freelog()
	 {
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement user=driver.findElement(By.xpath("//input[@placeholder='E-mail address']"));
		WebElement pass=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		WebElement btn=driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));

      
		
     // js.executeScript(“arguments[0].value=’Avinash Mishra’;”, webl);
		String text=driver.getTitle();
		 System.out.println("the title of page is "+text);
	 }
}
