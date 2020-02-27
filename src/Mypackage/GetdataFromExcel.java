package Mypackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetdataFromExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=null;
		XSSFWorkbook wbo=null;
		XSSFSheet wst=null;
		FileOutputStream fos=null;
		Row r=null;
		
		fis=new FileInputStream("C:\\Users\\Abdul Rajik shaik\\Desktop\\Testdata.xlsx");
		wbo=new XSSFWorkbook(fis);
		wst=wbo.getSheet("Sheet1");
		r=wst.getRow(2);
		int s= (int) r.getCell(2).getNumericCellValue();
		System.out.println(s);
		fos=new FileOutputStream("C:\\Users\\Abdul Rajik shaik\\Desktop\\Testdata.xlsx");
		wbo.write(fos);

	}

}
