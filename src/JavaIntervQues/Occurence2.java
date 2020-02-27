package JavaIntervQues;

import java.util.HashMap;

public class Occurence2 {

	public static void main(String[] args) {


		String s="shaik Abdul RAjik";
		HashMap<Character,Integer>hs=new HashMap<>();

		char[] ch1=s.toCharArray();
		for (char c : ch1) {
			if (hs.containsKey(c)) 
			{
				hs.put(c, hs.get(c)+1);
				//System.out.println(hs);

			} else {
				hs.put(c, 1);

			}
		}
		System.out.println("the actual string is : "+s);
		System.out.println(hs);
	}

}
