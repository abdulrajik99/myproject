package JavaIntervQues;

public class Insta {
	int empid;
	String name;
	float salary;

	Insta(int empid,String name,float salary)
	{
		this.empid=empid;

		this.name=name;

		this.salary=salary;

	}

	public static void main(String[] args) {

		Insta i1=new Insta(101, "arjun", 20000);

		Insta i2=new Insta(102, "rashi", 30000);

		Insta i3=new Insta(103, "anusha",40000);
		
		Insta i4=new Insta(104, "ramija",50000);

		System.out.println(i1.empid+" "+i1.name+" "+i1.salary);

		System.out.println(i2.empid+" "+i2.name+" "+i2.salary);

		System.out.println(i3.empid+" "+i3.name+" "+i3.salary);
		
		System.out.println(i4.empid+" "+i4.name+" "+i4.salary);
	} 

}
