package gestionEleves;
import java.util.ArrayList;

public class Eleve {
	private String nom;
	ArrayList<Integer> note = new ArrayList<Integer>();
	private double moyenne;
	
	Eleve(String nom){
		this.nom=nom;
	}
	
	public double getMoyenne() {
		return moyenne;
	}
	public String getNom() {
		return nom;
	}
	public ArrayList<Integer> getListeNote(){
		return note;
	}
	
	public void ajouterNote(int note) {
		getListeNote().add(note);
	}
	
	public double setMoyenne() {
		double somme=0;
		for(int i = 0; i < note.size(); i++) {
			somme=somme+note.get(i);
		}
		return moyenne=somme/note.size();
	}
	
	public String toString() {
		return "Le nom est : " + nom + " les notes : "+ note +" et la moyenne est : "+ setMoyenne();
	}
}


