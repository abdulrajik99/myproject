package JavaIntervQues;

import java.util.HashMap;

public class REpetetionOfaCharacterInaString {

	public static void main(String[] args) {


		String s="aabbcc11!!";
		HashMap<Character,Integer>hs=new HashMap<>();

		char[] ch1=s.toCharArray();
		for (char c : ch1) {
			if (hs.containsKey(c)) {
				hs.put(c, hs.get(c)+1);

			} else {
				hs.put(c, 1);

			}
		}
		System.out.println(hs);
	}

}
