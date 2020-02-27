package newtours;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrmloginusingJavaScriptExecuttr 
{
	static WebDriver driver=null;
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul Rajik shaik"
		  		+ "\\Desktop\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://ui.freecrm.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("abdulrajik5@gmail.com");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Crm@123456");
	
	WebElement lgnbtn=driver.findElement(By.xpath("//div[contains(@class,'ui fluid large blue submit button')]"));
	
	flash(lgnbtn, driver);
	System.out.println("the title is"+driver.getTitle());
	driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	driver.close();
	
	}

	public static void flash(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String bgcolour=element.getCssValue("backgroundcolour");
		for(int i=0;i<100;i++)
		{
		Changecolour("rgb(0,200,0)", element, driver);
		Changecolour(bgcolour, element, driver);
		}
		
	}
	public static void Changecolour(String colour,WebElement element,WebDriver driver)
	{
		JavascriptExecutor js1=((JavascriptExecutor)driver);
		js1.executeScript("arguments[0].style.backgroundColour = '"+colour+"'", element);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

   
}
