package Mypackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.IOException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingwithPoi 
{
	ChromeDriver driver;
	FileInputStream fso;
	XSSFWorkbook wbo;
	XSSFSheet wso;
	FileOutputStream fo;
	Row r;
	int rowc;
	@BeforeTest
	public void open()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul Rajik shaik\\Desktop\\project\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://www.edmodo.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@Test
	public void login() throws IOException
	{
		fso=new FileInputStream("C:\\Users\\Abdul Rajik shaik\\Desktop\\abdul.xlsx");
		wbo=new XSSFWorkbook(fso);
		wso=wbo.getSheet("Sheet1");
		driver.findElement(By.linkText("Login")).click();
		System.out.println("switched to frame");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		rowc=wso.getLastRowNum();
		for(int i=0;i<rowc;i++)
		{
			r=wso.getRow(i);
			driver.findElement(By.name("username")).clear();
			driver.findElement(By.name("username")).sendKeys(r.getCell(0).getStringCellValue());
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys(r.getCell(1).getStringCellValue());
			driver.findElement(By.id("qa-test-lightbox-login")).click();
			String actual=driver.getCurrentUrl();
			r.createCell(3).setCellValue(actual);
			
						
		}
		driver.get("https://www.edmodo.com/");
		fo=new FileOutputStream("C:\\Users\\Abdul Rajik shaik\\Desktop\\abdul.xlsx");
		wbo.write(fo);
			
		
		
	}
}
