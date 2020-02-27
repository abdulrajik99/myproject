package DecInterQestionsandans;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Orangehrm 
{
	String actualurllogin="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
	WebDriver driver=null;
	FileInputStream fis=null;
	XSSFWorkbook book=null;
	XSSFSheet sheet=null;
	FileOutputStream fo=null;
	@BeforeMethod
	public void setu()
	{
		try {
			fis=new FileInputStream("C:\\Users\\Abdul Rajik shaik\\Desktop\\Orangehrm.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			book=new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sheet=book.getSheet("Sheet1");
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul Rajik shaik"
			  		+ "\\Desktop\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
	}
	@Test
	public void orangelogin() throws IOException
	{
		String title =driver.getTitle();
		System.out.println("title is "+title);
	   
	   for(int i=0;i<=sheet.getLastRowNum();i++)// 0,1,2,3,4
	   {
		   
			   String username=sheet.getRow(i).getCell(0).getStringCellValue();
			   System.out.println("username is "+username);
			   driver.findElement(By.xpath("//input[@id='txtUsername']")).clear();
			   driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
			   String pass=sheet.getRow(i).getCell(1).getStringCellValue();
			   driver.findElement(By.xpath("//input[@id='txtPassword']")).clear();
			   driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(pass);
			   System.out.println("passwor is  "+pass);
			   driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
			   
	   File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(src, new File("C:\\Users\\Abdul Rajik shaik\\Desktop\\proof\\screenshot.png"));
	   String expected=driver.getCurrentUrl();
	  
	   if(actualurllogin.equals(expected))
	   {
		   System.out.println("valid user");
		   sheet.createRow(i).createCell(2).setCellValue("valid user");
	   }
	   else
	   {
		   System.out.println("Invalid user");
		   sheet.createRow(i).createCell(2).setCellValue("Invalid user");
	   }
	   
	   }
	
	fo=new FileOutputStream("C:\\Users\\Abdul Rajik shaik\\Desktop\\Orangehrm.xlsx");
	book.write(fo);
	fo.close();
	
	}
	@AfterMethod
	public void shut()
	{
		//driver.close();
	}
}
