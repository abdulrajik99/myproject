package Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithpopups {
	static WebDriver driver;
	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul Rajik shaik\\Desktop\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://html.com/input-type-file/");
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Users\\Abdul Rajik shaik\\Desktop\\Abdul exp-pdf.pdf");
	driver.close();
	}

}
