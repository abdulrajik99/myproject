package NaveenInterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class Removecommoncharactersintwostrings
{

	public static void main(String[] args) 
	{
		String string1 = "ahocdefghijklb6naa";
		String string2 = "javbrho";

		// char[] arrayofChar = string1.toCharArray();
		Set<Character> setOfCharString1 = new HashSet<Character>();
		for (int i=0; i<string1.length(); i++){
		setOfCharString1.add(string1.charAt(i));
		}

		StringBuilder duplicatebuilder = new StringBuilder();
		StringBuilder string2builder = new StringBuilder();
		StringBuilder string1builder = new StringBuilder(string1);

		for (int j=0; j<string2.length(); j++){
		char a = string2.charAt(j);
		if (setOfCharString1.contains(a)){
		setOfCharString1.remove(a);
		duplicatebuilder.append(a);
		}
		else{
		string2builder.append(a);
		}
		}
		System.out.println("String 1 without duplicates: "+setOfCharString1.toString());
		System.out.println("String 2 without duplicates: "+string2builder.toString());
		System.out.println("Duplicates among both strings: "+duplicatebuilder.toString());

	}

}
