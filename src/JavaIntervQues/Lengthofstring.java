package JavaIntervQues;

public class Lengthofstring {

	public static void main(String[] args) {
		
		String s="arjun";
		
		count(s);
				
			
			
		}
		
		private static void count(String x){
			
			
			int i=0;
			
			for(char c : x.toCharArray())
			{
				
				
				i++;

				System.out.print(c);
				
			}
			System.out.println("");
			System.out.println("length of the given string::"+i);
			
		}

}
 