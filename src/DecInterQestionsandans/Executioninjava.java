package DecInterQestionsandans;

public class Executioninjava
{
	
	static
	{
	 System.out.println("static");	
	}
	static y ob=new y();
	public static void main(String args[])
	{
		System.out.println("main methd ");
	}
	
}
class y{
	static 
	{
		System.out.println("y static block");
	}
	y()
	{
		System.out.println("y constructor");
	}
}