package Mypackage;


import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.jna.platform.FileUtils;

public class WorkingwithRadiobuttons {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul Rajik shaik\\Desktop\\project\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		List<WebElement> list=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("the no of radio buttons are"+list.size());
		for(int i=0;i<list.size();i++)
		{
		  String name=list.get(i).getAttribute("Name");	
			System.out.println("the names of radio buttons are"+name);
			if(list.get(i).isSelected())
			{
				System.out.println("name"+" "+"  is  active");
			}
			else
			{
				System.out.println("name"+" "+"  is Inactive");
			}
			File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			org.apache.commons.io.FileUtils.copyFile(srcfile ,new File("C:\\Users\\Abdul Rajik shaik\\Desktop\\spice\\proof.png"));
			
		}
		
	
		
		
				
				
				
				
		

	}

}
