package JavaIntervQues;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ArrayWithMap {

	public static void main(String[] args) {
          //hashmap,linkedhashmap,treemap
		Map<String, Integer> hm=new HashMap<String, Integer>();
		hm.put("Selenium", 100);
		hm.put("java", 120);
		hm.put("testng", 140);
		hm.put("Apachepoi", 160);
		System.out.println("map = "+hm);
		
		LinkedHashMap<String , Integer> lhm=new LinkedHashMap<>();
		lhm.put("map1", 100);
		lhm.put("map2", 120);
		lhm.put("hashmap", 130);
		lhm.put("linkedhashmap", 140);
		System.out.println("linkedhm  ="+lhm);
		TreeMap<String, Float> tm=new TreeMap<>();
		tm.put("sandy", 1000.00f);
		tm.put("ajay", 1100.00f);
		tm.put("candy", 2000.00f);
		tm.put("nandy", 3000.00f);
		System.out.println(tm);
		 Set<Map.Entry<String, Float>> s=tm.entrySet();
		 Iterator<Map.Entry<String, Float>> it=s.iterator();
		 while(it.hasNext())
		 {
			 Map.Entry<String, Float> me=it.next();
			 String s1=me.getKey();
			 Float f1=me.getValue();
			 System.out.println("key    "+s1);
			 System.out.println("value "+f1+50.00f);
			 
		 }
		 
		
		
	
	}

}
