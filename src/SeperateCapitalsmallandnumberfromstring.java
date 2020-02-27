
public class SeperateCapitalsmallandnumberfromstring
{

	public static void main(String[] args)
	{
	String s="Aa28848";
	int len=s.length();
	String upper=" ";
	String lower=" ";
	String num=" ";
	for(int i=0;i<len;i++)
	{
	  if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
	  {
		upper=" "+s.charAt(i)+upper;
	  }
	  else if(s.charAt(i)>='a'&&s.charAt(i)<='z')
	  {
		lower=" "+s.charAt(i)+lower;
	  }
	  else if(s.charAt(i)>='0'&&s.charAt(i)<='9')
	  {
		  num=" "+s.charAt(i)+num;
	  }
	  
	}
	
	    StringBuffer sb=new StringBuffer();
	    StringBuilder sbuild=new StringBuilder();
		System.out.println("num "+num);
		System.out.println("lower "+lower);
		System.out.println(" upper "+upper);
	
	
	}

}
