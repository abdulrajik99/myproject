package JavaIntervQues;

import java.util.Arrays;

public class New
{
	public static String Sort(String s)
	 {
	      char temp[]=s.toCharArray();
	      Arrays.sort(temp);
	      System.out.println("input is"+s);
	  return new String(temp);
	 }

	public static void main(String[] args) 
	{
		String s="selenium";
		String op=Sort(s);
		System.out.println("op    "+op);
	}

}
