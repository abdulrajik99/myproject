package NaveenInterviewQuestions;

import java.util.HashMap;

public class CountnoofCharactersFromString {
	
	public static void main(String[] args) 
	{
		String s="aavvcc@#$$$";
		   HashMap<Character , Integer> hs=new HashMap<>();
		   char[] c1 =s.toCharArray();
		   for( char c : c1)
		   { 
		      if(hs.containsKey(c))
		      {
		        hs.put(c,hs.get(c)+1);
		      } 
		      else
		      {
		      hs.put(c,1);
		      }
		   }
		     System.out.println(hs);
		 }    
      
      
	}


