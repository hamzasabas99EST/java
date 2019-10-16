package Tree;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class trie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> tree=new TreeSet<String>();
		tree.add("Nadia");
		tree.add("Yasser");
		tree.add("Mohammed");
		tree.add("Hanane");
		tree.add("Badre");
		
		Iterator<String> it = tree.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
	}
}
