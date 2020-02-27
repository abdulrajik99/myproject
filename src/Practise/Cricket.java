package Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricket {

	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul Rajik shaik"
		  		+ "\\Desktop\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
		driver.manage().window().maximize();
			driver.get("https://www.cricbuzz.com/live-cricket-scores/22774/nz-vs-ind-2nd-t20i-india-tour-of-new-zealand-2020");
		System.out.println(" title of page is   "+driver.getTitle());

	}

}
