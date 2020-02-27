import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class getdatafromexceltohashmap
{

	public static void main(String[] args) throws IOException 
	{
	FileInputStream fis=new FileInputStream("C:\\Users\\Abdul Rajik shaik\\Desktop\\capgemin.xlsx");
	XSSFWorkbook book=new XSSFWorkbook(fis);
	XSSFSheet sheet=book.getSheet("Sheet1");
	HashMap<String,String> hm=new HashMap<>();
	for(int i=0;i<=sheet.getLastRowNum();i++)
	{
		XSSFRow r=sheet.getRow(i);
		String name=r.getCell(0).getStringCellValue();
		System.out.print(name +" ");
		String  pass= r.getCell(1).getStringCellValue();
		System.out.println(pass);
		hm.put(name, pass);
		//System.out.println("array elements are");
		
	}
	Set<String> hs=new HashSet<String>();
	hs.add("banglore");
	hs.add("banglore");
	hs.add("andhra ");
	hs.add("delhi");
	hs.add("london");
	hs.add("bankok");
	System.out.println(hs);
	List<String> lis=new ArrayList<String>(hs);
	Collections.sort(lis);
	System.out.println("country names after sorting");
	System.out.println(lis);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	System.out.println(hm);
	

	}

}
