package newtours;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class fblogin 
{
	Logger log=Logger.getLogger(fblogin.class);
	WebDriver driver;
	boolean flag=false;
	
	@BeforeTest
	public void open()
	{
		log.info("****************************Starting browser****************************************");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul Rajik shaik"
				  		+ "\\Desktop\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver=new HtmlUnitDriver();
		log.info("****************************launchin facebook ****************************************");
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		log.info("****************************maximizeing window****************************************");
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	public void fbb()
	{
		log.info("****************************Starting first test case****************************************");
		Select sc=new Select(driver.findElement(By.xpath("//select[@id='day']")));
		List<WebElement> li=sc.getOptions();
		log.info("****************************getting names****************************************");
		for(WebElement web:li)
		{
		      	String text=web.getText();
			    if(text.equals("20"))
			   {
				  web.click();
				  flag=true;
				  break;
			   }
			    if(flag==true)
			    {
			    	break;
			    }
		      
		}
		log.info("******************************first test case completed**************************************");
	}
	
	
	@Test(priority=2)
	public void Selmonth()//working with dropddowns
	{
		log.info("****************************Starting second test case****************************************");
		Select scmonth=new Select(driver.findElement(By.xpath("//select[@id='month']")));
		Select scyear=new Select(driver.findElement(By.xpath("//select[@id='year']")));
		List<WebElement> mnt=scmonth.getOptions();
		List<WebElement> yer=scyear.getOptions();
		for(WebElement web2:mnt)
		{
			String mnthtext=web2.getText();
			System.out.println("months are"+mnthtext);
			if(mnthtext.equalsIgnoreCase("Dec"))
			{
				web2.click();
			}
		}
		log.info("****************************printing years****************************************");
		System.out.println("years are");
		for(WebElement web3:yer)
		{
			String yeartext=web3.getText();
			System.out.print(yeartext);
			if(yeartext.equals("1993"))
			{
				web3.click();
			}
		}
		log.info("****************************closing second test case****************************************");
	}
	
	
	@Test
	public void roundtripstatus()//working with radio buttons
	{
		WebElement rtrip=driver.findElement(By.xpath("//input[@type='radio']"));
		WebElement maleradio=driver.findElement(By.xpath("//input[@id='u_0_7']"));
		WebElement custmradio=driver.findElement(By.xpath("//input[@id='u_0_8']"));
		
		rtrip.click();
		boolean status=rtrip.isSelected();
		if(status==true)
	    System.out.println("active");
		else
			System.out.println("inactive");
		 maleradio.click();
		 boolean b2=maleradio.isSelected();
		if(b2==true)
			System.out.println("male radio is active");
		else
			System.out.println("male radio is in-active");
		custmradio.click();
		boolean b3=custmradio.isSelected();
		
		if(b3==true)
			System.out.println("custom radio is active");
		else
			System.out.println("custom radio is in-active");
		System.out.println("title"+driver.getTitle());
	
	}
	
}
