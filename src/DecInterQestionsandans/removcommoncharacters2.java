package DecInterQestionsandans;

import java.util.Scanner;

public class removcommoncharacters2 {
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two strings");
		String str1 =sc.nextLine();
		String str2 =sc.nextLine();
		String common = str1.replaceAll("[" + str2 + "]", "");
		String comm2=str2.replaceAll("[" + str1 + "]", "");
		System.out.println("common 1  "+common);
		System.out.println("common 2 "+comm2);
		String a="aaa";
		String b="java";
		String c="";
		c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
	}

}
