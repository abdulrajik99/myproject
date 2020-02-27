package Mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Workingwithcontextclick {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul Rajik shaik\\Desktop\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		WebElement gmail=driver.findElement(By.linkText("Luxury Rails"));
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		ac.contextClick(gmail).build().perform();
		WebElement about=driver.findElement(By.xpath("/html[1]/body[1]/div[8]/div[5]/footer[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]"));
		ac.moveToElement(about).build().perform();
		driver.findElement(By.linkText("Careers")).click();
		
		
		
	}

}
