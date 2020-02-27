package DecInterQestionsandans;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class practisewithtestng 
{
 @BeforeTest
 public void te()
 {
	 System.out.println("before test");
 }
 @AfterMethod
 public void tes()
 {
	 System.out.println("@after method");
 }
 @BeforeMethod
 public void upeer()
 {
	 System.out.println("before method ");
 }
 @Test 
 public void mat()
 {
	 System.out.println("test 1");
 }
 @Test 
 public void pmat()
 {
	 System.out.println("test 2");
 }
 
 
 @AfterTest
 public void aft()
 {
	 System.out.println("after test");
 }
	
}
