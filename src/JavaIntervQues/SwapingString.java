package JavaIntervQues;

public class SwapingString {

	public static void main(String[] args) {
		
		
		String a="ARJUN";
		String b="REDDY";
		System.out.println("before swap:"+a);
		System.out.println("before swap:"+b);
		
             a=a+b;
             b=a.substring(0,a.length()-b.length());
             a=a.substring(b.length());
             
             //a=arjun,b=reddu
             //a=a+b;  here a=arjunreddy
             //b=a.substring(0,a.length()-b.length()); here b=arjun
             //a=a.substring(b.length());  
		
		
		System.out.println("after swap:"+a);
		System.out.println("after swap:"+b);
		String x=a.toLowerCase();
		
		
		
		
		

	}

}
