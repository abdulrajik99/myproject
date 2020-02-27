package JavaIntervQues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArraywithTreeset 
{

	public static void main(String[] args) 
	{
		//for treeset
		Set<Integer> s=new TreeSet<>();
		s.add(90);
		s.add(23);
		s.add(13);
		s.add(93);
		System.out.println(s);
		HashSet< Integer> hs=new HashSet<>();
		hs.add(15);
		hs.add(15);
		hs.add(32);
		hs.add(48);
		System.out.println("the hashset value is"+hs);
		List<Integer> li=new ArrayList<Integer>(hs);
		Collections.sort(li);
		System.out.println("sorted hs"+li);
		
	}

}
