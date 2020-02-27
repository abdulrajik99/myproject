package NaveenInterviewQuestions;

public class OccuranceOfaWordinaString 
{

	public static void main(String[] args) 
	{
		String s="HAI hai java java java java welcome to java java";
		String word="java";
		int count=0;
		String a[]=s.split(" ");
		for(int x=0;x<a.length;x++)
		{
			if(word.equals(a[x]))
			{
				count++;
			}
		}
		System.out.println("the occurance of the "+word+"  is   "+count);
	}

}
