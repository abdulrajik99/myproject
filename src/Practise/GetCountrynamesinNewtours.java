package Practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GetCountrynamesinNewtours 
{
	WebDriver driver;
	FileInputStream fis=null;
	XSSFWorkbook book=null;
	XSSFSheet sheet=null;
	FileOutputStream fo=null;
	@BeforeMethod
	public void setu()
	{
		try {
			fis=new FileInputStream("C:\\Users\\Abdul Rajik shaik\\Desktop\\newtours.xlsx");
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
			driver.get("http://newtours.demoaut.com/");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
	}
	@Test
	public void openregisterpage() throws IOException
	{
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		Select sc=new Select(driver.findElement(By.xpath("//select[@name='country']")));
		List<WebElement> list=sc.getOptions();
		System.out.println("no of countries are  "+list.size());
		for(WebElement ele:list)
		{
			String text=ele.getText();
			System.out.println(""+text);
		}
		for(int i=0;i<sheet.getLastRowNum();i++)
		{
			String Actualcountryname=sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println("actual country name is "+Actualcountryname);
			String expected=list.get(i).getText();
			System.out.println("expected  "+expected);
			//sheet.getRow(i).getCell(1).setCellValue(expected);
			sheet.createRow(i).createCell(1).setCellValue(expected);
			
			
		}
	 fo=new FileOutputStream("C:\\Users\\Abdul Rajik shaik\\Desktop\\newtours.xlsx");
		book.write(fo);
		fo.close();
	}
}
