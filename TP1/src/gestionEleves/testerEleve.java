package gestionEleves;

public class testerEleve {

	public static void main(String[] args) {
		Eleve e=new Eleve("Hamza");
		e.ajouterNote(10);
		e.ajouterNote(15);
		e.ajouterNote(13);
		
		System.out.println(e.note.size());
	}
}
