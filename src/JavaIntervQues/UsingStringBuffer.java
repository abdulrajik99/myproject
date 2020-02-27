package JavaIntervQues;

public class UsingStringBuffer {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("core");
		System.out.println(sb1);
		StringBuffer sb2=new StringBuffer("java");
		System.out.println(sb2);
		System.out.println("the length of sb1  "+sb1.length());
		System.out.println("the length of sb1  "+sb2.length());
		System.out.println("sb1 after appending with sb2   "+sb1.append(sb2));
		System.out.println(sb1);
		
	}

}
