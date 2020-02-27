package Mypackage;

class myvalue{
	void m1(){
		System.out.println("WELCOME");
	}
	void m1(int a, int b)
	{
		System.out.println("The sum of two numbers is"+(a+b));
	}
}
public class Methodoverloading {
	public static void main(String[] args) {
				myvalue obj=new myvalue();
				obj.m1(10, 258);
				obj.m1();
	}

}
