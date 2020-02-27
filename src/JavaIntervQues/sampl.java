
package JavaIntervQues;

 abstract class De {

	abstract void show();
	
		 void print()
		{
			System.out.println("anusha");
		}
}
class sampl extends De
{
	public static int x=10;
	public void show()
	{
		
		System.out.println("Rashi");
		System.out.println("x value is"+x++);
	}
	
	public static void display()
	{
		System.out.println("Meghana");
	}
	
	
	public static void main(String[] args)
	{
	    sampl ob=new sampl();
	    ob.show();
	    System.out.println("default x is"+x);
		sampl.display();
	}

}
