package Mypackage;
class value1{
	void v1()
	{
		System.out.println("Automation");
	}
}
class value2 extends value1
{
	void v1()
	{
		System.out.println("Selenium");
	}
}

public class Methodoverriding {

	public static void main(String[] args) {
		value2 obj=new value2();
		obj.v1();
		

	}

}
