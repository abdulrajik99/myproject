package Mypackage;



public class Test {

	public static void main(String[] args)
	{
      String str="geeks for geeks";
      int count=0;
	   char ch[]=str.toCharArray();
	   for(int i=0;i<ch.length;i++)
	   {
		   char s=' ';
		 
		for(int j=i+1;j<ch.length;j++)
		{
			if(ch[i]==ch[j]&&ch[i]!=s)
			{
				System.out.println("the character "+ch[j]+"    is repeated ");
				count++;
				break;
			}
			
		}
		
	   }
      
	}

}
