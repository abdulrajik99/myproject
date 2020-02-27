package NaveenInterviewQuestions;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebaylogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul Rajik shaik\\Desktop\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS );
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/");
		//driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("watches");//it is working 
       // driver.findElement(By.xpath("//input[contain(@class ,'autocomplete')]")).sendKeys("mobile");	
		//driver.findElement(By.xpath("//input[starts-with(@id ,'gh-')]")).sendKeys("electronics");//itis working
	     // x path for links
		driver.findElement(By.xpath("//a[contains(text(),' Daily Deals')]")).click();
	
	    List<WebElement> links=driver.findElements(By.tagName("a"));
	     System.out.println("the no of links are"+links.size());
	    for (int i = 0; i < links.size(); i++)
	    {
		   System.out.println("the name of "+i+" st link is"+links.get(i).getText());	
		}
	}

}
