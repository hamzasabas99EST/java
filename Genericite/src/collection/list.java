	package collection;
import java.util.ArrayList;
import java.util.Iterator;

public class list {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
			list.add("1");
			list.add("2");
			list.add("3");
			list.add("4");
			list.add("5");
			list.add("6");
		Iterator it=list.iterator();
		while(it.hasNext()) {
			String str=(String)it.next();
			if(str.equals("1")|| str.equals("2")) it.remove();
			System.out.println(list);
		}
	}

}
