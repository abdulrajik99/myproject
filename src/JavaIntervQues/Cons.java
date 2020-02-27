package JavaIntervQues;



public class Cons
{
	static String reverse(String ori)
	{
		int len=ori.length();
		String rev=" ";
		for (int i = len-1; i >=0; i--) 
		{
			rev=rev+ori.charAt(i);

		}
		return rev;

	}


	public static void main(String[] args)
	{

		String s="test yantra";
		String s2= Cons.reverse(s);
		System.out.println(s2);
	}
}



		//by using string buffer




		/*String s="Rashi";
	StringBuffer sb=new StringBuffer(s);

System.out.println(sb.reverse());*/






























	