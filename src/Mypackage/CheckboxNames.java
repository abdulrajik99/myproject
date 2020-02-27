package Mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxNames {

	public static void main(String[] args)
	{
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul Rajik shaik\\Desktop\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("the no of checkbox are"+checkbox.size());
		WebElement stu=driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount"));
		stu.click();
		if(stu.isSelected())
		{
			System.out.println("student is checked");
		}
		else
		{
			System.out.println("student is not checked");
		}
		
	}

}
