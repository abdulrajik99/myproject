package JavaIntervQues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Arraylist2 {

	public static void main(String[] args) 
	{
		int x=0;
		HashSet< Integer> hs=new HashSet<>();
		ArrayList<Integer>list=new ArrayList<>();
		List<String> ll=new LinkedList<>();
		ll.add("abdul");
		ll.add("Selenium");
		System.out.println(ll);
		list.add(56);
		list.add(46);
		list.add(78);
		Collections.sort(list);
		System.out.println("ordered list is"+list);
		Collections.reverse(list);
		System.out.println("the reverse order is "+list);
		 
		
		hs.add(15);
		hs.add(15);
		hs.add(32);
		hs.add(48);
		List<Integer> li=new ArrayList<>(hs);
		Collections.sort(li);
		System.out.println("hashset values in order"+li);
		System.out.println("the hashset value is"+hs);
		Iterator<Integer> it=li.iterator();
		while(it.hasNext())
		{
			x=it.next();
			System.out.print("single hs  values are");
			System.out.println(x);
		}
		
		
	
	}

}
