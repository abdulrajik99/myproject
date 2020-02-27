package newtours;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class testdata 
{
	static FileInputStream fio=null;
	static String file="C:\\Users\\Abdul Rajik shaik\\Desktop\\Abdul\\Selenium\\src\\newtours\\Testdata.xlsx";
	static Workbook book=null;
	static Sheet sheet=null;
	static String sheetname="Sheet2";
	public static Object[][] gettestdata() throws EncryptedDocumentException, IOException
	{
		fio=new FileInputStream(file);
		book=WorkbookFactory.create(fio);
		sheet=book.getSheet(sheetname);
		Object [][]data=new Object[sheet.getLastRowNum()][sheet.getRow(1).getLastCellNum()];
		return data;
	}
}
