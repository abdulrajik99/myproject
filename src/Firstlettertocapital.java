
public class Firstlettertocapital {
public static void main(String args[])
{
	String s="java applicatio n";
	char[] c=s.toCharArray();
	int le=c.length;
	int i=1;
	c[0]=(char)(c[0]-32);
	while(i!=le)
	{
		if(c[i]==' ')
		{
			c[i+1]=(char)(c[i+1]-32);
		}
		++i;
	}
	System.out.println("input "+s);
	for(int j=0;j<c.length;j++){
		System.out.print(c[j]);

		
	}
	
}
}
