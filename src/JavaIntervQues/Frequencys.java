package JavaIntervQues;

public class Frequencys {

	public static void main(String[] args) {
		String s="xxrtytxxxxytudhxxbfhfxxxxxxhfgdj";
		int count=0;
		for (int i = 0; i <= s.length()-1; i++) {
			if (s.charAt(i)=='x') {
				count++;				
			}

		}
System.out.println(count);
	}

}
