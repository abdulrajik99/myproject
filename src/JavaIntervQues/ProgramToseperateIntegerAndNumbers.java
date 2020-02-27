package JavaIntervQues;

public class ProgramToseperateIntegerAndNumbers
{

	public static void main(String[] args) 
	{
		String s="abcdef123  45 67 jikl fj8i 8i9i9o99";
		System.out.println("input string is "+s);
		String alpha=s.replaceAll("[^A-Za-z]", "");
		String numb=s.replaceAll("[^0-9]", "");
		System.out.println("the alphabets "+alpha);
		System.out.println("numbers are   "+numb);
		
	}

}
