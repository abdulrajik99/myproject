package newtours;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class makemytrip
{
	/*Row r=null;
	static FileInputStream fio;
	static FileOutputStream fo;
	static String file="C:\\Users\\Abdul Rajik shaik\\Desktop\\Abdul\\Selenium\\src\\newtours\\Testdata.xlsx";
	static Workbook book=null;
	static Sheet sheet=null;
	static String sheetname="Sheet2";
*/		Robot r=null;
	static String depdate="Monday, 30 Dec 2019";
	static String returndate="Wed Jan 01 2020";
	static WebDriver driver=null;
	
	@BeforeMethod
	public void initial() throws AWTException
	{
		 r=new Robot();
	//r=sheet.createRow(0);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul Rajik shaik"
		  		+ "\\Desktop\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	}
	@Test
	public void linksTest() throws IOException
	{
	    List<WebElement> links=driver.findElements(By.tagName("a"));
	    String homepage=driver.getWindowHandle().toString();
	    System.out.println("total links are "+links.size());
	    for(WebElement linkname:links)
	    {
	    	
	    	   String Linkstex=linkname.getText();
	    	   System.out.println(Linkstex);
	    
	   	} 
	    
	 }
	@Test
	public void radiobuttons()
	{
		 WebElement onway=driver.findElement(By.xpath("//li[contains(text(),'Oneway')]"));
		 onway.click();
		 boolean b=onway.isEnabled();
		 if(b==true){
		 System.out.println("one way is enabled");
		 }
		 driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("Bengaluru");
		WebElement tocity= driver.findElement(By.xpath("//input[@id='toCity']"));
		tocity.sendKeys("Dubai");// DXB, Dubai International Airport United Arab Emirates
		WebElement depdate=driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]"));
		
		 
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+depdate+"')", depdate);
		WebElement returndate=driver.findElement(By.xpath("//span[contains(text(),'RETURN')]"));
		 JavascriptExecutor js2=(JavascriptExecutor)driver;
			js2.executeScript("arguments[0].setAttribute('value','"+returndate+"')", returndate);
			driver.findElement(By.xpath("//a[contains(@class,'primaryBtn font24 latoBlack widgetSearchBtn')]")).click();
	
	}
	    
	    
	    
	    
	}

