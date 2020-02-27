import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Worldtimeanddate 
{
	WebDriver driver=null;
 @BeforeMethod
 public void timesetup()
 {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul Rajik shaik"
		  		+ "\\Desktop\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
 }
 @Test
 public void m1()
 {
	 WebElement table=driver.findElement(By.xpath("//body[contains(@class,'tpl-fluid')]"
	 		+ "/div[@class='wrapper']/div[@class='main-content-div']/section[@class='bg--grey pdflexi-t--small']/div[@class='fixed']/section[@class='fixed']/div[1]"));
	 List<WebElement> rows=table.findElements(By.tagName("tr"));
	 int rownum=rows.size();
	 System.out.println("the no of rows are  "+rownum);
	 for(int i=0;i<rownum;i++)
	 {
		 List<WebElement> col=rows.get(i).findElements(By.tagName("td"));
		 int colnum=col.size();
		// System.out.println("the no of columns  are "+colnum);
		 for(int j=0;j<col.size();j++)
		 {
			 String text=col.get(j).getText();
			 System.out.print(col.get(j).getText()+" ");
		 }
		 System.out.println();
		  }
	 
 }
 
 
 
}
