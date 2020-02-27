package Myjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;

import org.apache.commons.collections4.multimap.HashSetValuedHashMap;
import org.testng.internal.thread.IAtomicInteger;

import com.graphbuilder.struc.LinkedList;

public class DifferentCollections 
{

	public static void main(String[] args) 
  {
		ArrayList al=new ArrayList<>();
		 al.add(45);//it allows int,string .float ..etc
		 al.add(90);
		 al.add(90);
		 al.add(90);
		 al.add(8);
		 al.add(99);
		 al.add(22);
		 al.add(1);
		 System.out.println(al);
		Collections.sort(al);
		 System.out.println("array list after sorted  "+al);
		 Iterator it=al.iterator();
		 while(it.hasNext())
		 {
			 System.out.println("the arraylist values are "+it.next());
		 }  
		 // by using linked list 
		 LinkedList ll=new LinkedList();
		 ll.addToHead(42);//it allows duplicate values also
		 ll.addToHead(42);
		 ll.addToHead(50);
		 ll.addToTail(90);
		 ll.addToTail(99);
		 System.out.println("the linked list values are  "+ll);
		 
		 
		 // by using hashset , it doesnt allows duplicate values
		 HashSet<Integer> hs=new HashSet<>();
		 hs.add(10);
		 hs.add(10);
		 hs.add(50);
		 System.out.println("the integer hashset values are  "+hs);
		 HashSet hh=new HashSet<>();
		 hh.add(15);
		 hh.add(30);
		 hh.add('h');
		 hh.add(30);
		 hh.add("hashset");
		 System.out.println("all the hashset values are "+hh);
		 
		 //linked hashset , it is ordered
		 LinkedHashSet llh=new LinkedHashSet<>();
		 llh.add(73);
		 llh.add(49);
		 llh.add(84);
		 
		 llh.add(73);
		 llh.add("hai");
		 llh.add('y');
		 llh.add('@');
		 System.out.println("linked hashset values "+llh);
		
		 
		 
		 LinkedHashSet lhset=new LinkedHashSet<>();
		 lhset.add("hai");
		 lhset.add("iam");
		 lhset.add("ant");
		 lhset.add("joy");
		 lhset.add("as");
		 lhset.add("Abdul");
		 lhset.add("Abdul");
		 System.out.println(lhset);
		 
		 
		 //tree set . it is 1-d 
		 TreeSet<Integer> ts=new TreeSet<>();
		 TreeSet<Float> ts1=new TreeSet<>();
		 TreeSet<Character> ts2=new TreeSet<>();
		 TreeSet<String> ts3=new TreeSet<>();
		 ts.add(99);
		 ts.add(10);
		 ts.add(10);
		 ts2.add('!');
		 ts3.add("String");
		 ts1.add(800.99f);
		 System.out.println("the treeset int,float ,character ,string  value");
		 System.out.println(""+ts+ts1+ts2+ts3);
		 
		 //hashmap[key ,value ] 
		HashSetValuedHashMap<String , Float > hm= new HashSetValuedHashMap<>();
		hm.put("james", 500.00f);
		hm.put("james", 500.00f);
		hm.put("a", 100.00f);
		hm.put("b", 200.00f);
		hm.put("c", 300.00f);

		System.out.println("hashmap output "+hm);
		
		//linked hashmap
		
		LinkedHashMap<String, Integer> lhm=new LinkedHashMap<>();
		lhm.put("java", 169);
		lhm.put("selenium", 321);
		lhm.put("Automation", 144);
		lhm.put("Automation", 144);
		System.out.println("linked hashmap "+lhm);
	
		//Treemap
		TreeMap<String , Integer> tm=new TreeMap<>();
		tm.put("james", 144);
		tm.put("abdul", 7);
		tm.put("sam", 999);
		tm.put("sam", 999);
		System.out.println("tree map otput "+tm);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
  }

}
