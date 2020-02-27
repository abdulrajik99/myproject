package Myjava;

public class sampleThisprogram
{
	int salary=200;
	public void salary(int salary)
	{
		System.out.println(salary);
		System.out.println("this.salary "+this.salary);
		this.salary=salary;
		System.out.println(salary);
		System.out.println("th"+this.salary);
		
	}
	public void salary()
	{
		System.out.println(this.salary);
	}
	public static void main(String[] args) {
		sampleThisprogram ob=new sampleThisprogram();
		ob.salary(600);
		ob.salary();

	}

}
