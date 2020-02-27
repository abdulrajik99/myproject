package DecInterQestionsandans;

  class Today
{
    void baseMethod()
	{
		System.out.println("base method called....");
	}
}
 class Derived extends Today
 {
	  void baseMethod()
	 {
		 System.out.println("Derived method called.....");
	 }
 }
   class ConstrucWithInterffface
    {
    	public static void main(String args[])
    	{

	Today ob=new Derived();
	ob.baseMethod();
	new Today().baseMethod();
    	}	
}
