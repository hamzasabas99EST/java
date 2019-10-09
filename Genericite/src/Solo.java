
public class Solo <T>{
	
	private T valeur;
	public Solo(T valeur) {
		this.valeur=valeur;
	}
	public String toString() {
		
		return ""+this.valeur;
	}
	
	public static void main(String[] args) {
		
		Solo<Integer> s1=new Solo<Integer>(123);
		Solo<String> s2=new Solo<String>("blabla");
		System.out.print(s2);
	}

}
