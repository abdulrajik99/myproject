package JavaIntervQues;

public class Howtoseparatethestringcharactera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="arjunreddy";
		
		char[] ch=s.toCharArray();
		
		int len=ch.length;
		System.out.println("number of characters:" +len);
		
		for(char c1:ch){
			System.out.println("the characters are '"+c1+"'");
		}
		
		
	

	}

}
