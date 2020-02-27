import java.util.Scanner;

public class SeperatingintegerCharacterfromString {

	public static void main(String[] args) {
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char []c1=s.toCharArray();
		String num="";
		String alp="";
		String upper="";
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(c1[i]))
			{
				num+=c1[i];
			}
			else if(Character.isUpperCase(c1[i]))
			{
				
				
				upper+=c1[i];
			}
			else if(Character.isAlphabetic(c1[i]))
			{
				alp+=c1[i];
			}
		}
		System.out.println("the digits are  "+num);
		System.out.println("the alphabets are "+alp);
		System.out.println("upper case are "+upper);
	}

}
