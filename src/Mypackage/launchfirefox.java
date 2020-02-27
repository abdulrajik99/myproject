package Mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchfirefox {

	public static void main(String args[])
	{
		ChromeDriver driver=null;
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Abdul Rajik shaik\\Desktop\\project\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	List<WebElement> image=driver.findElements(By.tagName("img"));
	System.out.println("the no of images are "+image.size());
	
	}
}
