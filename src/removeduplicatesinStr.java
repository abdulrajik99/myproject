
public class removeduplicatesinStr 
{

	public static void main(String[] args) 
	{
	  String s="ram and sam are friends and are colleques";
      String [] arr=s.split(" ");
	  String out=" ";
	  System.out.println("arr length "+arr.length);
	for(int i=0;i<arr.length;i++){
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i].equals(arr[j]))
			{
				out=" "+arr[i]+out;
			}
		}
	}
	
		 System.out.println("out"+out);
	
	
	
	
	
	
	}

}
