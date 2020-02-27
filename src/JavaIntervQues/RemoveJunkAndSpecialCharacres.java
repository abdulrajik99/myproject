package JavaIntervQues;

public class RemoveJunkAndSpecialCharacres {

	public static void main(String[] args) {

		String s="#$@%&^^0988988jamesbond007";

      s=s.replaceAll("[^a-zA-Z0-9]", "");
      System.out.println(s);




	}

}
