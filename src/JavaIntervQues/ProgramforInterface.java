package JavaIntervQues;


interface A
{
	int x=10;
	void show();
}
public class ProgramforInterface implements A
{

	public static void main(String[] args)
	{
	  System.out.println(A.x);
	  new ProgramforInterface().show();
	}

	@Override
	public void show()
	{
	 System.out.println("overridden method");	
	}

}
