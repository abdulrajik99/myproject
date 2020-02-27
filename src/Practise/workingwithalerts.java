package Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
//simport org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class workingwithalerts {
	static WebDriver driver;
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul Rajik shaik\\Desktop\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
	//		driver=new ChromeDriver();
	driver=new HtmlUnitDriver();
		System.out.println("*********************starting browser***********************");
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		System.out.println("the title of the page is"+driver.getTitle());
		System.out.println("*********************starting browser***********************");
		
	}

}
