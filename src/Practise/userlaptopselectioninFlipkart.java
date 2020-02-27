package Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class userlaptopselectioninFlipkart
{
	WebDriver driver=null;

	@BeforeMethod
	public void set()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul Rajik shaik"
		  		+ "\\Desktop\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
	}
	@Test
	public void userlogin()
	{
		Actions 	ac=new Actions(driver);
		driver.findElement(By.xpath("//a[contains(text(),'Login & Signup')]")).click();
		String title=driver.getTitle();
		System.out.println("title is  "+title);
		//driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='Km0IJL col col-3-5']")));
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("abdulrajik5@gmail.com");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("8977402865");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		String expected=driver.findElement(By.xpath("//div[contains(text(),'Abdul')]")).getText();
		System.out.println(" the expected username is "+expected);
		WebElement electronics=driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"));
		//moving to electronics
		ac.moveToElement(electronics).build().perform();
		//clicking on laptops
		driver.findElement(By.xpath("//li[@class='_1KCOnI _2BfSTw _1h5QLb _3ZgIXy']//a[contains(text(),'Laptops')]")).click();
		JavascriptExecutor js=((JavascriptExecutor)driver);
		 js.executeScript("window.scrollBy(0,250)", "");
		 //clicking on apple brand
		 driver.findElement(By.xpath("//div[@class='_1GEhLw'][contains(text(),'Apple')]")).click();
		 //JavascriptExecutor js2=((JavascriptExecutor)driver);
		 //js2.executeScript("window.scrollBy(0,400)", "");
		 //clicking on 4* rating 
		 //driver.findElement(By.xpath("//div[@class='_1GEhLw'][contains(text(),'4★ & above')]")).click();
		 WebElement applemacselecting=driver.findElement(By.xpath("//div[contains(text(),'Apple MacBook Air Core i5 5th Gen - (8 GB/128 GB S')]"));
		 applemacselecting.click();
		 //clicking on apple laptop 
		 String applemac=driver.findElement(By.xpath("//div[contains(text(),'Apple MacBook Air Core i5 5th Gen - (8 GB/128 GB S')]")).getText(); 
		System.out.println("the apple laptop details are "+applemac);
		//entering pincode
		driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("560037");
		//clicking on add to cart
		driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
		
			}
	@AfterMethod
	public void shutdown()
	{
		driver.close();
	}
}
