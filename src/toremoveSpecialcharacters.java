
public class toremoveSpecialcharacters {

	public static void main(String[] args) {
		String sp="";
		String s="abdulrajik5@gmail.com";
		for(int i=0;i<s.length();i++)
		{
			if(!Character.isAlphabetic(s.charAt(i)))
			{
				sp+=s.charAt(i);
			}
		}
		System.out.println(sp);

	}

}
