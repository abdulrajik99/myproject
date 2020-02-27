package JavaIntervQues;

public class LargestAndSmallestNumber {

	public static void main(String[] args) {
	Integer[] in={1,9,99,57,3,2,754,897,123,9847,55};
	
	int largest=in[0];
	int smallest=in[0];
	for (int i = 1; i < in.length; i++) {
		if (in[i]>largest) {
			largest=in[i];
			//System.out.println(largest);
		}
		else if (in[i]<smallest) {
			smallest=in[i];
			//System.out.println(smallest);
		}
	}
	
	
	
	System.out.println("THE LARGEST NUMBER IS   "+largest);
System.out.println("THE SMALLEST NUMBER IS    "+smallest);
	}

}
