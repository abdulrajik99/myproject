package JavaIntervQues;
			
import java.util.Arrays;

public class AddingTwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] even={2,4,6};
		
		int[] odd={1,3,5};
		
		int[] result=add(even,odd);
		
		
		System.out.println("first value:" +Arrays.toString(even));
		
		System.out.println("second value:" +Arrays.toString(odd));
		
		System.out.println("result:" +Arrays.toString(result));
		
		
		
		
		

	}

	private static int[] add(int[] even, int[] odd) {
		// TODO Auto-generated method stub
		
		
		
		int length = even.length < odd.length ? even.length
                : odd.length;
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            result[i] = even[i] + odd[i];
        }

        return result;
    



	}

	
		
		
	}
	
	
	



