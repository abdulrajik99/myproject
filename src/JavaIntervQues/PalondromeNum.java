package JavaIntervQues;

public class PalondromeNum {

	
	public static void main(String[] args) {
		String s1="malayalam";
		int j=0;
		System.out.println("input is "+s1);
		char[]c=s1.toCharArray();
		int l=c.length;
		char n[]=new char[l];
		int i=0;
		while(i!=l)
		{
			n[l-1-i]=c[i];
			++i;
		}
		
		while(j!=l)
		{
			if(n[j]!=c[j])
			{
				System.out.println("not palinndroem");
				System.exit(0);
			}
			else
			{
				++i;
				continue;
			}
		}
		System.out.println("palindrome");
				  
      
		
		
		
		
	}

}
