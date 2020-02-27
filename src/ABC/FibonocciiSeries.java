package ABC;

public class FibonocciiSeries {

	public static void main(String[] args) {
		//0,1,1,2,3,5,8,13
		int n1=0,n2=1;
		int sum;
		System.out.print(n1+" "+n2);
		for(int i=2;i<100;i++)
		{
			sum=n1+n2;
			System.out.println(" "+sum);
			n1=n2;
			n2=sum;
		}

	}

}
