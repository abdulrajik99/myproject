package DecInterQestionsandans;

public class SttttttringComparision {
	public static void decreasenumber(int x)
	{
		if(x>=0)
		{
			decreasenumber(x-1);
		}
		System.out.println("number"+x);
	}

	public static void main(String[] args) 
	{
		int z=10;
		int y=10;
     String a=new String("sharma is a good player");
     String b="sharma is a good player";
     System.out.println("A value is"+a);
     System.out.println("B value is"+b);
     if(a==b)
     {
    	 System.out.println("a==b");
     }
     if(a.equals(b))
     {
    	 System.out.println("a equals b");
     }
	
        decreasenumber(2);
	
	
	if(z==y)
	{
		System.out.println("z is == to y");
	}
	else
	{
		System.out.println(" not equals  ");
	}
}}
