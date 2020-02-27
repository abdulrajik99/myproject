package Mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Google {
	ChromeDriver driver;

	WorkingwithTestng obj=new WorkingwithTestng();
	@Test(priority=1)
	public void tc1()
	{
		obj.openbrowser();
	}
	 @Test(priority=2)
	 public void tc2()
	 {
		 driver=new ChromeDriver();
		 driver.get("https://2movierulz.ms/category/telugu-movies-2018/");
		 driver.manage().window().maximize();
		 List<WebElement> links=driver.findElements(By.tagName("a"));
		 System.out.println("total links are"+links.size());
		 for(int i=0;i<links.size();i++)
		 {
			 String name=links.get(i).getText();
			 System.out.println(name);
		 }
	 }
}
