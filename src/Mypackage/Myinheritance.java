package Mypackage;
class a
{
	int a=383;
	void show()
	{
		System.out.println("A CLASS");
	}
}
class b extends a
{
	int b=838;
	void display()
	{
		System.out.println("B CLASS");
	}
}

public class Myinheritance {

	public static void main(String[] args) {
		b obj=new b();
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.display();
		obj.show();

	}

}
