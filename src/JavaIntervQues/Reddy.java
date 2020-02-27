package JavaIntervQues;

interface Anu
{
	static int x=5;
	public static void show(){
		System.out.println("kamala");
	}
    public static void print(){
    	
    	System.out.println("megha aksha");
    }
    
}


public class Reddy implements Anu{

	static int y=10;
	public static void show()
	{
		System.out.println("rowdy");
	}
	public static void print()
	{
		System.out.println("nuvvu");
	}
	public static void vaid()
	{
		System.out.println("arjun");
	}



	public static void main(String[] args) {
        Reddy r=new Reddy();
        r.show();
        r.print();
        System.out.println(y);
        
		    
	    
	
	}

}
