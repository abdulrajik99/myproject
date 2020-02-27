package newConcepts;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProgramToStoreUniqueValues 
{

	public static void main(String[] args) 
	{
		Set value=new HashSet<>();
		value.add("selenium");
		value.add("100");
		value.add("Automation");
		System.out.println("the size is "+value.size());
		Iterator it=value.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		String s="aabbcc";
		int x=s.length();
		
	}

}
