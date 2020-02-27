package JavaIntervQues;


public class Token {

	public static void main(String[] args) {
		/*StringTokenizer  st=new StringTokenizer("who are you");
		while (st.hasMoreTokens()) {
			
			System.out.println(st.nextToken());
		}*/
		String s="who are you";
		String[] s2=s.split(" ");
		for (int i = 0; i < s2.length; i++) {
			System.out.println(s2[i]);
		}
		}
		
		
	}
	


