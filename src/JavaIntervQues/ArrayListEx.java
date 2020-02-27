package JavaIntervQues;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<>();
	
		
		list.add(56);
		list.add(46);
		list.add(78);
		System.out.println("1  "+list);
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println("2 "+list);
		list.add(2, 98);
		System.out.println("3 "+list);
		list.set(2, 35);
		System.out.println(" 4 "+list);
		Collections.sort(list);
		System.out.println("5 "+list);
		String s1="abdul",s2="Rajik";
		s1=s1+s2;
		System.out.println(s1);
		StringBuffer sb=new StringBuffer(s1);
		sb.reverse();
		System.out.println(sb);
		
		
		
	}
	

}
