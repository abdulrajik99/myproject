package ABC;

public class FirstlettertoCapital
{
	public static void main(String[] args)
	{
		String  var="java application with selenium for testing";
		char[] y=var.toCharArray();
		int l=var.length();
		int i=1;
		y[0]=(char)(y[0]-32);
		while(i!=l)
		{
			if(y[i]==' ')
			{
				y[i+1]=(char)(y[i+1]-32);
			}
			++i;
		}
		System.out.println(y);
		
	}

}
