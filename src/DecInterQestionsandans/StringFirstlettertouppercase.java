package DecInterQestionsandans;


public class StringFirstlettertouppercase {

	public static void main(String[] args) {
		
		String s="welcome to java programming";
		System.out.println("input is "+s);
		String s2[]=s.split(" ");
		for(int i=0;i<s2.length;i++)
		{
			s2[i]=(s2[i]).substring(0, 1).toUpperCase()+(s2[i]).substring(1);
		
			
		}
		for(int j=0;j<s2.length;j++)
		{
			System.out.print(s2[j]+" ");
		}

	}

}
