package Practise;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DropDownListSortedOrNot
{
	 @Test
	   public void dropDownListSortedOrNot() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul Rajik shaik"
			  		+ "\\Desktop\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("http://www.ebay.in/");
	      driver.manage().window().maximize();
	      Thread.sleep(3000);  
	      WebElement element = driver.findElement(By.id("gh-cat"));
	      element.click();
	      List<WebElement> dropDownvalues = element.findElements(By.tagName("option"));
	      ArrayList<String> listValues = new ArrayList<String>();
	      listValues.add("eBay Motors"); 
	      System.out.println("values are");
	      for(WebElement value : dropDownvalues) {
	         System.out.println( value.getText());
	         listValues.add(value.getText());
	      }
	      System.out.println("number of values");
	      boolean sortedOrNot = sortedOrNot(listValues);
	        //assertEquals(true, sortedOrNot);
	      driver.close();
	   }
	   public boolean sortedOrNot(ArrayList<String> dropDownValues)
	   {
	      System.out.println( dropDownValues.size());
	      for(int i=0; i<dropDownValues.size();i++) 
	      {
	         int temp = dropDownValues.get(i).compareTo(dropDownValues.get(i+1));
	         if(temp>1) 
	         {
	            System.out.println("i value"+i);
	            return false;
	         }
	      }
	      return true; 
	   }

}
