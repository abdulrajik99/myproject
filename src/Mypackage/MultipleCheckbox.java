package Mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckbox {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul Rajik shaik\\Desktop\\project\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (int i = 0; i < checkbox.size(); i++)
		{
		 String name =checkbox.get(i).getAttribute("Name");
		 if(checkbox.get(i).isSelected())
		 {
			 System.out.println(name+" "+" Is Active");
		 }
		 else
		 {
			 System.out.println(name+" "+" Is Inactive");
		 }
		}
	}

}
