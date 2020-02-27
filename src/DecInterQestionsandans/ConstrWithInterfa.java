package DecInterQestionsandans;

 class Testsuper4 
{
	Testsuper4()
     {
    	 System.out.println("animal is created");
     }
}   

 class Dog extends Testsuper4
 {
	 Dog()
	 {
		 //super()    present here implicitly it will call super class defaullt constructor
		 System.out.println("dog is created");
	 }
 }
    class  ConstrWithInterfa
    {
	     public static void main(String[] args) 
	    {
	    	 Dog d=new Dog();
	    }
    }

