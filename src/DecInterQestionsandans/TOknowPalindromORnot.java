package DecInterQestionsandans;

public class TOknowPalindromORnot 
{

	public static void main(String[] args) 
	{
		String m="nan";
		String sp="";
		int l=m.length();
		System.out.println(l);
		for(int i=l-1;i>=0;i--)
		{
			sp=sp+m.charAt(i);
			
		}
		System.out.println("reverse string is "+sp);
		if(m.equals(sp))
		{
		System.out.println(" palindrome");
		}
		else
		{
			System.out.println(" not palindrome");
		}
	}

}
