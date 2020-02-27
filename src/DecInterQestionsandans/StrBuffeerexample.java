package DecInterQestionsandans;

public class StrBuffeerexample 
{

	public static void main(String[] args) 
	{
		StringBuffer sb1=new StringBuffer("Selenium");
		System.out.println("sb1 value is   "+sb1);
		StringBuffer sb2=new StringBuffer("Automation");
		System.out.println("1 values are"+sb1+sb2);
		System.out.println("2 values are"+sb2);
		sb1.append(sb2);
		System.out.println(sb1);
		sb1.insert(1, "java");
		System.out.println("after inserting "+sb1);
		sb1.delete(1, 5);
		System.out.println("after deleting"+sb1);
		sb1.reverse();
		System.out.println("reverse "+sb1);
		sb1.reverse();
		System.out.println("substring of sb1"+(sb1.substring(0, 8)));
	}

}/*
sb1 value is   Selenium
1 values areSeleniumAutomation
2 values areAutomation
SeleniumAutomation
after inserting SjavaeleniumAutomation
after deletingSeleniumAutomation
reverse noitamotuAmuineleS
substring of sb1Selenium*/