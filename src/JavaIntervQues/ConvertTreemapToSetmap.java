package JavaIntervQues;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ConvertTreemapToSetmap {

	public static void main(String[] args) 
	{
		int x=0;
		float y;
          TreeMap<Integer, Float> tm= new TreeMap<>();
          tm.put(101, (float) 5000.00);
          tm.put(102, (float) 6000.00);
          tm.put(103, (float) 70900.00);
          tm.put(104, (float) 78000.00);
          tm.put(105, (float) 8000.00);
          System.out.println(tm);
          
          Set<Map.Entry<Integer, Float>> st=tm.entrySet();
          Iterator<Map.Entry<Integer , Float>> it=st.iterator();
          System.out.println("empno   salary ");
          while(it.hasNext())
          {
        	  Map.Entry<Integer, Float>me =it.next();
        	  x=me.getKey();
        	  y=me.getValue();
        	  System.out.println("  "+x+"   "+y);
        	
        	  
          }
	}

}
