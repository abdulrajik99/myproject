package JavaIntervQues;

public class AmstrongNumber //cubes of each number and adding all the numbers 
{

	public static void isAmstrongNumber(int num){
		int r;
		int cube=0;
		int t;
		t=num;
		while (num>0) {
			
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
			System.out.println(num);
				
		}
		if(t==cube)
		{
			
			System.out.println("amstrong number");
		}
		else {
			System.out.println("not a amstrong number");
		}
		
		
		
		
	}
	public static void main(String[] args) {
	
		isAmstrongNumber(153);
		String s="Abdul";
		String b=" ";
		int l=s.length();
		for(int i=l-1;i>=0;i--)
		{
			b=b+s.charAt(i);
		}
		System.out.println(b);
		
	}

}
