package JavaIntervQues;

public class ReverseInteger {

	public static void main(String[] args) {
		int num=1234574;
		int rev=0;
		while (num!=0) {
			rev=rev*10+num%10;
			num=num/10;
			System.out.println(num);
		}
System.out.println(rev);
	}

}
