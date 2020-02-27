package NaveenInterviewQuestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynammicgooglesearch 
{
	static String word="selenium interview questions pdf" ;
	static WebDriver driver;
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul Rajik shaik\\Desktop\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
	     driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS );
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(word);
		////ul[@role='listbox']//li/preceding::div[@class='sbl1 sbl1p']/span/b
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println("no of suggestions are     "+list.size());
		System.out.println("the suggestion names are +");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
		}
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getText().equals(word))
			{
				list.get(i).click();
				break;
			}
		}
	}
}
