package DecInterQestionsandans;

public class ConnnnsssstructorOVvvvvvvverloadingwithThisssssMethod 
{
    public ConnnnsssstructorOVvvvvvvverloadingwithThisssssMethod()
    {
    	this(1);//here it is written explicitly
    	System.out.println("cons.....1");
    }
	public ConnnnsssstructorOVvvvvvvverloadingwithThisssssMethod(int x)
	{
		this(1,"hi"); //here it is written explicitly
		System.out.println("cons.....2");
	}
	public ConnnnsssstructorOVvvvvvvverloadingwithThisssssMethod(int y,String s)
	{
		System.out.println("cons....3");
	}
    
	
	public static void main(String[] args) 
	{
		ConnnnsssstructorOVvvvvvvverloadingwithThisssssMethod d=new ConnnnsssstructorOVvvvvvvverloadingwithThisssssMethod();
	}

}
