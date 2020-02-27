package JavaIntervQues;

import java.util.Arrays;

public class HowToString {

	public static String sortString(String inputString)
	{
		char[] c=inputString.toCharArray();
		
		Arrays.sort(c);
		
		return new String(c);
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		String inputString= "radhika";
		
		String outputString=sortString(inputString);
		
		
		System.out.println("inputstring:"  +inputString);
		
		System.out.println("outputString:" + outputString );

		
		int a=99,b=88;
		String j="naveem";
		System.out.println(j+a*b);
	}

}
