package JavaIntervQues;

public class isCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcd55444";
		int a=0;
		int d=0;
		char [] c=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(Character.isAlphabetic(c[i]))
			{
				a++;
			}
			else
				if(Character.isDigit(c[i]))
				{
					d++;
				}
		}
		System.out.println("char are "+a);
		System.out.println("digits  are "+d);
	}

}
