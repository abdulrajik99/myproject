package Myjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class JavaProgramtokeepinAscendingOrder {

	public static void main(String[] args) {
		int a[]={23,45,99,78,81};
		char[] c={'a','b','z','y','r'};
		String s1=Arrays.toString(a);
		System.out.println(s1);
		Arrays.sort(a);
		String s2=Arrays.toString(a);
		System.out.println(s2);
		ArrayList<Character> al=new ArrayList<>();
		al.add('b');
		al.add('b');
		al.add('a');
		al.add('z');
		al.add('r');
		System.out.println(al);
		Collections.sort(al);
		System.out.println("values after sorting is"+al);
		
		
		
	}

}
