package DecInterQestionsandans;

public class Secondlargestnumber
{

	public static void main(String[] args)
	{
	int []	a={10,32,748,4,9,990};
	int size,temp;
	size=a.length;
	System.out.println("the input string length is "+size);

	 for(int y:a)
	    {
	    	System.out.print("  "+y);
	    }
	 System.out.println(" ");
	   // System.out.println("second largest is  "+a[size-2]);
    for(int i=0;i<size;i++)
    {
    	for(int j=i+1;j<size;j++)
    	{
    		if(a[i]>a[j])
    		{
    			temp=a[i];
    		a[i]=a[j];
    		a[j]=temp;
    		}
    	}
    }
    System.out.println("output is");
    for(int x:a)
    {
    	System.out.print(x+" ");
    }
    System.out.println("");
    System.out.println("second largest is  "+a[size-2]);
	}

}
