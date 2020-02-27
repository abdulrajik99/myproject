package Practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class gettestdatafromExcel
{
	
     static FileInputStream file=null;
    static XSSFWorkbook book=null;
    static XSSFSheet sheet=null;
    
    
	public static void getexceldata()
	{
		try {
			file=new FileInputStream("‪C:\\Users\\Abdul Rajik shaik\\Desktop\\Orangehrm.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			book=new XSSFWorkbook(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sheet=book.getSheet("Sheet1");
		for(int i=0;i<sheet.getLastRowNum();i++)
		{
			Row r=sheet.getRow(i);
			for(int j=0;j<r.getLastCellNum();j++)
			{
				System.out.print(r.getCell(j).getStringCellValue());
			}
		}
		System.out.println(" ");
		
	}
	
	public static void main(String args[])
	{
		gettestdatafromExcel.getexceldata();
	}
}
