
public class PermutationsOfaString
{
	static void printPermutn(String str, String ans) //abc
	{ 

		// If string is empty 
		if (str.length() == 0)//2!=0
		{ 
		//	System.out.print(ans + " "); 
			return; 
		}  

		for (int i = 0; i < str.length(); i++)//0,1,2
		{ 

			// ith character of str 
			char ch = str.charAt(i); 
			System.out.println("i value is  "+i+" and character is  = "+ch);
			// Rest of the string after excluding 
			// the ith character 
			String ros = str.substring(0, i) + 
						str.substring(i + 1); 
			System.out.println(" ros value is "+ros);

			// Recurvise call 
			printPermutn(ros, ans + ch); 
		} 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		String s = "abc"; 
		printPermutn(s, ""); 
	} 
	
}
