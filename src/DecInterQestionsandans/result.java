package DecInterQestionsandans;

public class result
 {
	  int res(int n)
	{
		if(n==0)
			return 0;
		return(n%9==0)?9:(n%9);//if condition is true it will return 9 or(n%9)will be returned
		
	}
	
	
	public static void main(String args[])
	{
		int n=1251;
		System.out.println("output is   "+new result().res(n));
			
	}
}
