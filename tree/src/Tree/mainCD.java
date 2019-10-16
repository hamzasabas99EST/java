package Tree;
import java.util.*;

public class mainCD {

	public static void main(String[] args) {
		 ArrayList<CD> al = new ArrayList<CD>(); 
		 
			al.add(new CD("zoubair","alice wonder land",249.0));
			al.add( new CD("Hamza","la boite à merveille",49.0));
			al.add( new CD("Limam","Beauty and Beast",249.0));
			
		 
		 
	        System.out.println( "Avant le tri : \n");
	        Iterator<CD> it =al.iterator();
	        while(it.hasNext())
	        	System.out.println(it.next());
	        Collections.sort(al);
	        
	        System.out.println( "Après le tri : \n"); 
	        it=al.iterator();
	        while(it.hasNext())
	        System.out.println( it.next()); 


	        
	}

}
