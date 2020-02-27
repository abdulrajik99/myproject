package Mypackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class withpoi {
	ChromeDriver driver=null;
	Row r=null;
	FileInputStream fso=null;
	XSSFWorkbook wbo=null;
	XSSFSheet wso=null;
	int x=0;
	FileOutputStream fo=null;
	@BeforeTest
	public void browser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abdul Rajik shaik\\Desktop\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.get("http://www.newtours.demoaut.com/");
	     driver.manage().window().maximize();
	}
     @Test
     public void logi() throws IOException
     {
    	 
    	 fso=new FileInputStream("C:\\Users\\Abdul Rajik shaik\\Desktop\\abdul.xlsx");
    	 wbo=new XSSFWorkbook(fso);
    	 wso=wbo.getSheet("Sheet1");
    	 
    	 System.out.println(wso.getLastRowNum());
    	 for(int i=1;i<2;i++)
    	 {
    		 
    		 r=wso.getRow(i);
    		 for(int j=0;j<7;j++)
    		 {
    			      
    			 System.out.println(r.getCell(j).getStringCellValue().toString());
    		 driver.findElement(By.linkText("REGISTER")).click();
    		 driver.findElement(By.name("firstName")).sendKeys(r.getCell(0).getStringCellValue());
    		 driver.findElement(By.name("lastName")).sendKeys(r.getCell(1).getStringCellValue());
    		 driver.findElement(By.name("userName")).sendKeys(r.getCell(2).getStringCellValue());
    		 driver.findElement(By.name("address1")).sendKeys(r.getCell(3).getStringCellValue());
    		 driver.findElement(By.id("email")).sendKeys(r.getCell(4).getStringCellValue());
    		 driver.findElement(By.name("password")).sendKeys(r.getCell(5).getStringCellValue());
    		 driver.findElement(By.name("confirmPassword")).sendKeys(r.getCell(6).getStringCellValue());
             driver.findElement(By.xpath("//input[@name='register']")).click();   
    		 }
    	 }
    	  fo=new FileOutputStream("C:\\Users\\Abdul Rajik shaik\\Desktop\\abdul.xlsx");
    	  wbo.write(fo);
    	 
    	 
    	 
    	 
     }
     
}
