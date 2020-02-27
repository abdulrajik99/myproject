package Myjava;

public class FinallyExample 
{

	public static void main(String[] args) 
	{
		
		try
		{
		final int x=200;
		
		System.out.println("x value is "+x);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally block is executed");
		}
		//finalize is used to perform clean up processing 
		//just before object is garbage collected
		FinallyExample ob1=new FinallyExample();
		FinallyExample ob2=new FinallyExample();
		System.out.println(ob1);
		System.out.println(ob2);
		ob1=null;
		ob2=null;
		System.out.println("ob1 ="+ob1);
		System.out.println("ob2 ="+ob2);
		System.gc();
		
		
	}

}
