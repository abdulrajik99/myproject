
public class CommonElementsinTWOarrays 
{

	public static void main(String args[])
	{
		int a[]={30,35,10,20,40,90};
		int b[]={20,35,45,85};
		//int common[]={};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				
				if(a[i]==b[j])
				{			
					System.out.print(a[i]+" ");
				}
			}
		}
		
		System.out.println();
	}
}
