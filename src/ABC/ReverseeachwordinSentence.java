package ABC;

public class ReverseeachwordinSentence {

	public static void main(String[] args)
	{
		int length;
		String output=" ";
	String s="java program";
	String [] sen=s.split(" ");
	System.out.println(" len"+sen.length);
	for(String word:sen)
	{
		//System.out.println(word);
		//System.out.println(word.length());
		length=word.length();
		for(int i=length-1;i>=0;i--)
		{
			output=output+word.charAt(i);
		}
		output=output+" ";
	}
	System.out.println(output);
	

	}

}
