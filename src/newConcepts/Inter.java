package newConcepts;


interface Tenth{
	
	
	void print();
	
}

public class Inter implements Tenth {

public	void print()
	{
		System.out.println("Rashi");
	}
	void show(){
		System.out.println("anusha");
	}
	
	public static void main(String[] args) {
Inter i=new Inter();
i.print();
i.show();
	}

}
