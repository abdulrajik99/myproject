package Practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PdffileuploadUsingRobotconcepts
{
	Robot r=null;
	WebDriver driver=null;
	Actions ac=null;
	@BeforeMethod
	public void set()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul Rajik shaik"
		  		+ "\\Desktop\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	@Test
	public void uploadpdf() throws InterruptedException, AWTException
	{
		r=new Robot();
		String title= driver.getTitle();
		System.out.println("title is  "+title);
		driver.findElement(By.xpath("//span[contains(text(),'Select WORD files')]")).click();
		Thread.sleep(4000);
		//sendKeys("C:\\Users\\Abdul Rajik shaik\\Desktop\\abdul Fesher.docx");
		//select file toupload
		StringSelection strselection=new StringSelection("C:\\Users\\Abdul Rajik shaik\\Desktop\\abdul Fesher.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselection, null);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		//clicking on convert to pdf button
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement down=driver.findElement(By.xpath("//button[@id='processTask']"));
		ac=new Actions(driver);
		ac.moveToElement(down).click().build().perform();
		Thread.sleep(8000);
		//downloading pdf file
		driver.findElement(By.xpath("//a[@id='pickfiles']")).click();

		driver.close();
	}

}
