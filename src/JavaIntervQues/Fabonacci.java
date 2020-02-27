package JavaIntervQues;

public class Fabonacci {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=2;
		
		for (int i = 1; i < 20; i++) {
			
			c=a+b;//1,3,5,
			System.out.println(a);
			a=b;//1,2
			b=c;//2,3
			
		}
		
		

	}

}
