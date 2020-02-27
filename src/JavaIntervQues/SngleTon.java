package JavaIntervQues;

public class SngleTon {

	private static SngleTon instance;
	
	private SngleTon(){
		
	}
	public static SngleTon getInstance(){
	
		if(instance==null){
			instance=new SngleTon();
		}
		return instance;
	}
	
	
	public static void main(String[] args) {
		
		SngleTon.getInstance();
	}

}
