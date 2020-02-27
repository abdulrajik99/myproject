package mousemovement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class usingactionsclass
{
	 WebDriver driver=null;
	 
	@BeforeMethod
	public void setup()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul Rajik shaik"
	  		+ "\\Desktop\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
	driver=new ChromeDriver();
	//driver=new HtmlUnitDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	}
	@Test(priority=1)
	public void action() throws InterruptedException
	{
		Actions 	ac=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'Men')]"));
		ac.moveToElement(ele).build().perform();
		Thread.sleep(3000);
		System.out.println("title is "+driver.getTitle());
		 driver.findElement(By.xpath("//a[contains(text(),'Flip- Flops')]")).click();
		
		 List<WebElement> frame=driver.findElements(By.tagName("frame"));
		 System.out.println("the no of framess are"+frame.size());
		WebElement maxprice=driver.findElement(By.xpath("//div[@class='_1YoBfV']//select[@class='fPjUPw']"));
		Thread.sleep(5000);
		Actions moveSlider = new Actions(driver);
		 moveSlider.dragAndDropBy(maxprice, 30, 0).build().perform();
		 
		
	}
	@Test(priority=2)
	public void countinglinks()
	{
		List<WebElement> list=driver.findElements(By.tagName("a"));
		System.out.println("the no of links are"+list.size());
		
		for(WebElement webele:list)
		{
			System.out.println("link name is "+webele.getText());
		}
	}
	







}

