package JavaIntervQues;

//import java.util.HashMap;
//import java.util.Map;

public class Star {

	public static void main(String[] args) {
		String value = "{first_name = naresh,last_name = kumar,gender = male}";
		value = value.substring(1, value.length()-1);           //remove curly brackets
		System.out.println("input"+value);
		String[] keyValuePairs = value.split(",");              //split the string to creat key-value pairs
	//	Map<String,String> map = new HashMap<>();               

		for(String pair : keyValuePairs)                        //iterate over the pairs
		{
		//    String[] entry = pair.split("=");                   //split the pairs to get key and value 
		  //  map.put(entry[0].trim(), entry[1].trim());          //add them to the hashmap and trim whitespaces
		    System.out.println(pair);
		}
		

	}

}
