package Myjava;


public class FindDuplicate {
	
public void print(String []x)
{
	String space=" ";
	for(int i=0;i<x.length;i++)
	{
	   for(int j=i+1;j<x.length;j++)
	   {
		   if(x[i].equals(x[j]))
		   {
			   space=space+x[i]+" ";
		   }
	   }
	}
	   System.out.println("dup is "+space+" ");

	
}

	public static void main(String[] args) {
        String a[]={"java","Selenium","c","java","Eclipse","Eclipse"};
        FindDuplicate ob=new FindDuplicate();
        ob.print(a);
        int a1=30,a2=30,a3=30;
        int large=a1>a2?a1:a2;
        System.out.println("large b/w 2 num "+large); 
        large=large>a3?large:a3;
         System.out.println("largest  "+large);
        
        
	}

}
