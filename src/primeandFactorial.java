import java.util.Scanner;

public class primeandFactorial
{
public void fact(int a)
{
	int count=0;//7
	for(int i=1;i<=a;i++)//1,2,3,4,5,,6,7
	{
		if(a%i==0)
		{
			count++;
		}
	}
	if(count==2)
	{
		System.out.println("the number "+a+" is a prime number");
	}
	else
		System.out.println("the number "+a+" is not a prime number");
}
	public static void main(String[] args)
	{
		System.out.println("please enter a number to know prime or not");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		primeandFactorial ob=new primeandFactorial();
		ob.fact(x);
		System.out.println("enter a number to find factorial");
		Scanner sc2=new Scanner(System.in);
		int fact=sc2.nextInt();
		int sum=1;
		for(int j=1;j<=fact;j++)
		{
			sum=sum*j;
			
		}
		System.out.println("fact is  "+sum);
	}

}
