package Tree;

public class CD implements Comparable<CD> {
	
	private String auteur,titre;
	private double prix;
	public CD(String auteur,String titre, double prix) {
		this.auteur=auteur;
		this.titre=titre;
		this.prix=prix;
	}
	public String toString() {
		return "CD [auteur=" + auteur + ", titre=" +titre+", prix= " +prix +"]";
	}
	public String getAuteur() {
		return auteur;
	}
	public String getTitre() {
		return titre;
	}
	public double getPrix() {
		return prix;
	}
	public int compareTo(CD c) {
		if(this.prix==c.prix) {
		return 0;
		}else if(this.prix>c.prix) {
			return 1;
		}else return -1;
	}
	
	
	
	
	
}
