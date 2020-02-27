package Mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fbrowser {

	public static void main(String[] args) {
		WebDriver driver=null;
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Abdul Rajik shaik\\Desktop\\eclipse\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		
		
		
	}

}
