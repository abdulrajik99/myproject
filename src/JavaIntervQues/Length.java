package JavaIntervQues;

public class Length {

	public static void main(String[] args) {
   /*int[] num={5,6,7,4,7,3,8};
   System.out.println(num.length);
*/
		/*
		String s="arjun reddy";
		System.out.println(s.length());
		*/
		
		
		
		String s="ARJUN REDDY";
		int len=s.length();
		String rev="";
		for (int i = len-1; i >=0 ; i--) {
			rev=rev+s.charAt(i);
			
		}
		
		
		System.out.println(rev);
		
		
		
	}

}
