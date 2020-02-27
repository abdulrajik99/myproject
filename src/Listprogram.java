import java.util.ArrayList;
import java.util.Arrays;

public class Listprogram
{

	public static void main(String[] args)
	{
	ArrayList al=new ArrayList<>();
	ArrayList sortedal=new ArrayList<>();
	al.add(3);
	al.add("R");
	al.add("M");
	al.add(4);
	al.add(89);
	al.add("f");
	al.add("j");
	al.add(4);
	
	System.out.println("input "+al);
	String [] stlist=new String[al.size()];
    for(int i=0;i<al.size();i++)
    {
    	if(al.get(i).getClass().getSimpleName().equalsIgnoreCase("Integer"))
    	{
    		stlist[i]=Integer.toString((int)al.get(i));
    	}else stlist[i]=(String)al.get(i);
    }
    Arrays.sort(stlist);
   
    for(int j=0;j<stlist.length;j++){
    	sortedal.add(stlist[j]);
    }
    System.out.println("sorted list");
    System.out.println(sortedal);
	
	}

}
