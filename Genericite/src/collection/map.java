package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class map {

	public static void main(String[] args) {
		Map<Integer,String> mymap=new HashMap<Integer, String>();
		mymap.put(1,"un");
		mymap.put(2,"deux");
		mymap.put(3,"trois");
		mymap.put(4,"quatre");
		mymap.put(5,"cinq");
		mymap.put(6,"six");
		
		Set<Integer> setInt=mymap.keySet();
		Iterator<Integer> it=setInt.iterator();

		while(it.hasNext()) {
			int key=it.next();
			
			System.out.println("["+key+"] => "+mymap.get(key));
		}
		
	}

}
