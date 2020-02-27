package newtours;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Softassertion 
{

	@Test
	public void softassert()
	{
		SoftAssert as=new SoftAssert();									//output	
																	/*hardassert method started
																	softasserr method started
																	softassert method executed
																			PASSED: softassert
	 																	FAILED: hardAssert*/
		System.out.println("softasserr method started");
		as.assertTrue(false);
		System.out.println("softassert method executed");
	}
	@Test
	public void hardAssert()
	{
		System.out.println("hardassert method started");
		Assert.assertTrue(false);
		System.out.println("me executed");
	}
}
