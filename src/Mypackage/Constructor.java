    package Mypackage;
class Demo
{
	Demo()
	{
		System.out.println("WELCOME");
	}
	Demo(int a, int b)
	{
		System.out.println("THE SUM IS   "+(a+b));
	}
	Demo(boolean b)
	{
		System.out.println("THE RESULT IS "+b);
	}
}

public class Constructor {

	public static void main(String[] args) {
		Demo obj=new Demo(1,55);
		Demo ob=new Demo(true);

	}

}
