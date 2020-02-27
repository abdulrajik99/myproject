package DecInterQestionsandans;

public class programtoremovespaces {

	public static void main(String[] args) {
		String s="hcl electronic city bangalore";
		String space=" ";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				space=space+s.charAt(i);
			}
		}
		System.out.println("after removing spaces  "+space);

	}

}
