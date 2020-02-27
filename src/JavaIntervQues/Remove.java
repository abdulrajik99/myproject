package JavaIntervQues;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Remove {

	public static void main(String[] args) {
	
		
		
		
		   String[] name = {"aim","rajesh","raju","aim"};

		    Set<String> myset  = new HashSet<String>();
		    Collections.addAll(myset,name);

		       System.out.println(myset);
		       for(String s1:name)
		       {

			       System.out.println(s1);   
		       }
	}

	}



