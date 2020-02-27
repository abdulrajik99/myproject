package JavaIntervQues;


public class StrTrim {

	public static void main(String[] args) {
		String a="hello abdul Rajik welcome to Banglore";
		String b="hello abdul rajik welcome to Banglore";
		System.out.println("length of string a is"+a.length());
		System.out.println("the character at 8 th position is "+a.charAt(8));
		int x=a.indexOf('a');  //it prints first time when a is occured
		System.out.println(x);
		int y=a.indexOf('a', x+1);
		System.out.println("comp both strings "+a.compareTo(b));
		System.out.println("comp both cases ignoring case sensitive"+a.compareToIgnoreCase(b));
		System.out.println(y);
		System.out.println(a.indexOf('a', y+1));
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.substring(x, y));
		
		
		//split
		String test="hello_world_welcome";
	 	String c[]=  test.split("_");
	 	for(int d=0;d<c.length;d++)
	 	{
	 		System.out.println(c[d]);
	 	}
		
	
      String s1="abdul";
      String s2="Rajik";
      int u=99;
      int q=43;
      System.out.println(s2+u+q+s1);
      
	}


}

