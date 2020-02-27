    package JavaIntervQues;

public class CountStringCharacters {

	public static void main(String[] args) {
		String test="aabbcc    89756544@@#@";
		count(test);

	}

	public static void count(String x) {
		// TODO Auto-generated method stub
		
		int  a=x.length(); //getting length of the string
		char[] c=x.toCharArray(); //converting string into character array
		
		int letter =0;
		
		
		int num =0;
		
		int space =0;
		
		int other =0;
		
		for (int i = 0; i <x.length(); i++) {
			
			if (Character.isLetter(c[i])) 
			{
				letter ++;
				System.out.println("letters"+c[i]);
				
			}
			else if (Character.isDigit(c[i])) {

				num ++;
				
				
			}
			else if (Character.isSpaceChar(c[i])) {
				
				space ++;
				System.out.println("space  are"+c[i]);
			}
			else {
				other ++;
			}
		}
		
		System.out.println(" THE ENTERED STRING  is ' "+x+" ' LENGTH IS "+a);
		
		System.out.println("letter are :" +letter);
		
		System.out.println("num are :" +num);
		
		System.out.println("space:" +space);
		
		System.out.println("other:" +other);
		
		
		
		

	}

	
	}

