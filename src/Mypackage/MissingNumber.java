package Mypackage;

public class MissingNumber {

	public static void main(String[] args) {
		int sum=0;
		int a[]={1,2,3,4,5,6};
		for(int x=0;x<a.length;x++)
		{
			sum=sum+a[x];
		}
		System.out.println("the sum is"+sum);
		int sum1=0;
		for(int y=1;y<=a.length+1;y++){
			sum1=sum1+y;
		}
		System.out.println(sum1);

		System.out.println("the missing number is"+(sum1-sum));
	}

}
