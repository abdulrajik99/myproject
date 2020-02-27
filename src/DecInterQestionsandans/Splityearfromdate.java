package DecInterQestionsandans;

public class Splityearfromdate {

	public static void main(String[] args) {
		String d="10/07/1993";
		String []s=d.split("/");
		String year=s[2];
		System.out.println("the year is  "+year);

	}

}
