package Mypackage;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mercury_links_nooflinks {

	public static void main(String[] args)throws FileNotFoundException {
		WebDriver driver=null;
		try{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Abdul Rajik shaik\\Downloads\\geckodriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		driver.manage().window().maximize();
	
	}catch(Exception e)
	{
		System.err.println(e);
	}
		finally{
			try{
				driver.close();
				
			}catch(Exception e)
			{
				System.err.println(e);
			}
		}

}
}
