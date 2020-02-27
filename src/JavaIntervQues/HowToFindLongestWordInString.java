package JavaIntervQues;

public class HowToFindLongestWordInString {

	public static void main(String[] args) {
		String s="hello my name is shaikabdulrajik";

		String[] Word=s.split(" ");  //hello -5
									 //my -2 , name-4 , is-2 ,shaikabdulrajik- 15

		String LongWord="  ";

		for (int i = 0; i < Word.length; i++) {

			if (Word[i].length()>=LongWord.length()) // 5>0 2>5 4>5  2>5 15>5   
			{
			 // 5  , false ,false ,f , 15
				LongWord=Word[i]; //shaikabdulrajik

			}

		}


		System.out.println("the word is "+LongWord);
		System.out.println("position is "+LongWord.length());








	}
}


