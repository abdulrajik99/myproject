package newtours;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class spiceejet 
{
	static WebDriver driver=null;
		public static void main(String args[])
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul Rajik shaik"
			  		+ "\\Desktop\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		System.out.println("title is  "+driver.getTitle());

		WebElement oneway= driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']"));
		oneway.click();
		boolean b=oneway.isEnabled();
		if(b==true)
		{
			System.out.println("one way is selected");
		}
		WebElement sc= driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));
		sc.clear();
		sc.sendKeys("Hyderabad");
		WebElement arrivalcity=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']"));
		arrivalcity.clear();
		arrivalcity.sendKeys("Dubai");
		//this is dep date driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']"));
		WebElement deptable=driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']"));
		List<WebElement> columns=deptable.findElements(By.tagName("td"));
		for(WebElement cell:columns)
		{
			if(cell.getText().equals("30"))
			{
				cell.findElement(By.linkText("30")).click();
				break;
			}
		}
		WebElement desti=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(desti).build().perform();
		ac.click();
		
		
		WebElement returndate=driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']"));
		List<WebElement> rettable=returndate.findElements(By.tagName("td"));
		for(WebElement recell:rettable)
		{
			if(recell.getText().equals("14"))
			{
				recell.findElement(By.linkText("14")).click();
				break;
			}
		}
		
		
		
//		driver.close();
		}
}
