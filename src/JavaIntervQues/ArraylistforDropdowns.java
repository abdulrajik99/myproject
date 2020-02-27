package JavaIntervQues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class ArraylistforDropdowns
{
	public static void main(String args[])
	{
		ArrayList<String> al=new ArrayList<>();
		al.add("a");
		al.add("z");
		al.add("y");
		al.add("a");
		al.add("b");
		al.add("c");
		System.out.println(al);
		Collections.sort(al);
		System.out.println("after sort"+al);
		Set<String> s=new TreeSet<>(al);
		System.out.println(s);
		
	}
}
