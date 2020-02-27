package newtours;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class mercurydropdown 
{
	WebDriver driver;
	boolean b=false;
	@BeforeMethod
	public void open()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul Rajik shaik"
				  		+ "\\Desktop\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='white-text']")).click();
		driver.findElement(By.xpath("//span[@class='white-text']")).click();
		
	}
	@Test(priority=1)//links
	public void WorkingonMercurylinks()
	{
		List<WebElement> link=driver.findElements(By.tagName("a"));
		System.out.println("total links "+link.size());
		System.out.println("link names ");
		for(WebElement web:link)
		{
			String name=web.getText();
			System.out.println(name);
			
		}
	}
	
	@Test(priority=2)
	public void workingonHolidayDurationdropdown()
	{
		Select sc=new Select(driver.findElement(By.xpath("//select[@id='duration_d']")));
		List<WebElement>  duration=sc.getOptions();
		for(WebElement web2:duration)
		{
			String s2=web2.getText();
			System.out.println("durations are"+s2);
			if(s2.equals("1Nights+2Days"))
			{
				web2.click();
			}
		}
	}
	@Test(priority=3)// roundtrip
	public void workingonFlightsradiobutton()
	{
		driver.findElement(By.xpath("//a[@id='flights']")).click();
		WebElement oneway= driver.findElement(By.xpath("//label[2]//input[1]"));
		WebElement rountrip=driver.findElement(By.xpath("//label[@class='active']//input[@name='tripType']"));
		oneway.click();
		boolean b=oneway.isSelected();
		if(b==true)
			System.out.println("oneway is enable");
		else
			System.out.println("oneway is disabled");
		rountrip.click();
		boolean b2=oneway.isSelected();
		if(b2==true)
			System.out.println("roundtrip is enable");
		else
			System.out.println("roundtrip  is disabled");
	}
	
	@Test(priority=4)
	public void FlightsdatereturnCalender()
	{
		driver.findElement(By.xpath("//a[@id='flights']")).click();
		
		WebElement returndatetable=driver.findElement(By.xpath("//input[@id='dpf2']"));
		returndatetable.click();
		WebElement table=driver.findElement(By.xpath("//body//div[17]"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		for(WebElement row:rows)
		{
			List<WebElement> colu=row.findElements(By.tagName("td"));
			//System.out.println("dates are");
			for(WebElement c:colu)
			{
				String s=c.getText();
				System.out.println(s);
				if(s.equals("25"))
				{
					c.click();
					b=true;
					break;
				}
				if(b==true)
				{
					break;
				}
			}
		}
	}
	@Test
	public void getimages()
	{
		List<WebElement> img=driver.findElements(By.tagName("img"));
		System.out.println("no of images aree   "+img.size());
		for(WebElement i:img)
		{
			System.out.println(i.getAttribute("src"));
		}
	}
	
	
	@AfterMethod
	public void last()
	{
		driver.close();
	}

}
 