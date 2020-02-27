
public class Secondmaxnumber
{
	public void secmaxnumber()
	{
		int x[]={10,20,8,90,100,1,3,8,99};
		int temp=0;
		int l=x.length;
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i]>x[j])
				{
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		System.out.println("second largest "+x[l-2]);
		for(int j=0;j<x.length;j++)
		{
			System.out.println("list in order "+x[j]);	
		}
		
	}
	public static void main(String[] args)
	{
		Secondmaxnumber ob=new Secondmaxnumber();
		ob.secmaxnumber();

	}

}
