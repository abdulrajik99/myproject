package JavaIntervQues;

 abstract class Bank {


	abstract void salary();

	abstract void currentBalance();

	void repoRate()
	{
		System.out.println("6.7");
	}
}
   public class AxisBank extends Bank{

	public void salary(){
		System.out.println("60000");
	}
	public void currentBalance(){
		System.out.println("8440000");


	}

	public static void main(String[] args) {

		Bank info=new AxisBank();
         info.salary();
         info.currentBalance();
         info.repoRate();

	}

}
