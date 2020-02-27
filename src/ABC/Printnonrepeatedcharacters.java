package ABC;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Printnonrepeatedcharacters {

	public static void main(String[] args) {
		String s="abcad";
		
		//System.out.println("holl val   "+holl);
		char[]c=s.toCharArray();
		int size=c.length;
		Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		int i=0;
		while(i!=size)
		{
			if(map.containsKey(c[i])==false)
			{
				map.put(c[i], 1);
			}
			else{
				int oldval=map.get(c[i]);
				int newval=oldval+1;
				map.put(c[i], newval);
			}
		++i;
		}
		
		Set<Map.Entry<Character, Integer>> hmap=map.entrySet();
		for(Map.Entry<Character, Integer> data:hmap)
		{
			if(data.getValue()==1)
			{
				System.out.println(data.getKey()+" "+data.getValue());
			}
			else
			{
				System.out.println(data.getKey()+" "+data.getValue());
			}
		}

	}

}
