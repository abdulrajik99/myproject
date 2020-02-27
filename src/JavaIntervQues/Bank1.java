

package JavaIntervQues;




public abstract class Bank1 {
	abstract void salary();

	abstract void currentBalance();

	void repoRate() 
	{
		System.out.println("6.7");
	}
}
class AxiBank extends Bank1{

	public void salary(){
		System.out.println("60000");
	}
	public void currentBalance(){
		System.out.println("8440000");


	}
	public static void main(String[] args) {
		AxisBank info=new AxisBank();
        info.salary();
        info.currentBalance();
        info.repoRate();

	}

}
