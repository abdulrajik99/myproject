package DecInterQestionsandans;

public class ArithmeticExccccepwithTryCatchandfinal 
{

	public static void main(String[] args) throws ArithmeticException 
	{
		try{
		int a=1/0;
		System.out.println("a="+a);
		}catch(Exception e)
		{
			System.out.println("exception caught");
		}

	}

}
