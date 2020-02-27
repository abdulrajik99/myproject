package ABC;

public class SeperateEvenandOddfromArray {

	public static void main(String[] args) {
		int a[]={10,20,3,4,6,7,8,9};
		for(int num:a)
		{
			if(num%2==0)
			{
				System.out.print("even "+num);
			}
			else
			{
				System.out.print("odd "+num);
			}
			System.out.println(" ");
		}

	}

}
