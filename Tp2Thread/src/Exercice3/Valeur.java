package Exercice3;

public class Valeur {
	int valeur;
	Valeur(int val){
		valeur=val;
	}
	public int getVal() {
		return valeur;
	}
	public synchronized void add(int i) {
		valeur+=i;
	};
		
	public String toString() {
		return "Valeur est : "+this.valeur;
	}
}
