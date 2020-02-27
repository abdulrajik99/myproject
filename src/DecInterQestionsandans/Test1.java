package DecInterQestionsandans;

public class Test1 {

	static int counter(String str,char x)
	{
		int count=0,n=10;
		for(int i=0;i<str.length();i++)
		if(str.charAt(i)==x)
			count++;
		int repition=n/str.length();
		count=count*repition;
		for(int i=0;i<n%str.length();i++)
		{
			if(str.charAt(i)==x)
				count++;
		}

		return count;
	}
	
	public static void main(String[] args) 
	{
		String s="abcac";
		System.out.println(counter(s,'b'));    //output :4
	}
}
