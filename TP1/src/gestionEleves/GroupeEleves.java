package gestionEleves;

import java.util.ArrayList;

public class GroupeEleves {
	ArrayList<Eleve> listeEleve = new ArrayList<Eleve>();
	
	public int nombre() {
		return listeEleve.size();
	}
	
	public ArrayList<Eleve> getListe(){
		return listeEleve;
	}
	
	public void ajouterEleve(Eleve eleve) {
		listeEleve.add(eleve);
	}
	
}
