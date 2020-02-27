package Mypackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class InsertDataIntoExcel
{

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis=null;
		XSSFWorkbook wbo=null;
		XSSFSheet wst=null;
		FileOutputStream fos=null;
		Row r=null;
		
		fis=new FileInputStream("C:\\Users\\Abdul Rajik shaik\\Desktop\\Testdata.xlsx");
		wbo=new XSSFWorkbook(fis);
		wst=wbo.getSheet("Sheet1");
		for(int i=0;i<10;i++)
		{
		r=wst.createRow(i);
		for(int j=0;j<10;j++)
		{
		r.createCell(j).setCellValue("Automation Testing");
		}
		}
		fos=new FileOutputStream("C:\\Users\\Abdul Rajik shaik\\Desktop\\Testdata.xlsx");
		wbo.write(fos);
	}

}
