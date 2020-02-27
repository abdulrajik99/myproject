package Mypackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Workingwithmultiplewindows 
{
	WebDriver driver;
    @BeforeTest
    public void open()
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul Rajik shaik\\Desktop\\project\\chromedriver_win32\\chromedriver.exe");
    	driver=new ChromeDriver();
    	driver.get("https://www.online.citibank.co.in/");
        driver.manage().window().maximize();
    }
    @Test
    public void browser()
    {
    	WebDriverWait wait = new WebDriverWait(driver, 2);    //madam
    			 Alert alert = wait.until(ExpectedConditions.alertIsPresent());
    			 alert.dismiss();
    	driver.findElement(By.linkText("APPLY FOR CREDIT CARDS")).click();
    	/*String parent=driver.getWindowHandle();
    	Set<String> popup=driver.getWindowHandles();
    	Iterator<String > it=popup.iterator();
    	while(it.hasNext())
    	{
    		String pophandle=it.next().toString();
    		if(!pophandle.contains(parent))
    		{
    			driver.switchTo().window(pophandle);
    			driver.close();
    		}
    	}*/
    	
    }
}
