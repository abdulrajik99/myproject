package ABC;

import java.util.Arrays;

public class Stringuniqueornot {
public static boolean isunique(String input){
	char[] c=input.toCharArray();
	Arrays.sort(c);
	 for (int i = 1; i < c.length; ++i)
	 {
         if (c[i] == c[i-1])
         {
             return false;
         }
	 }
	 return true;
}
	public static void main(String[] args) {
		String a="abcd";
		boolean bb=Stringuniqueornot.isunique(a);
		if(bb==true)
		{
			System.out.println("unique");
		}
		else
			System.out.println("not unique");
	}

}
