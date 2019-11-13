import java.io.*;

public class Game implements Serializable{
	private String nom,style;
	private double prix;
	private  Player player;
	public Game(String nom,String style, double prix,Player p) {
		this.nom=nom;
		this.style=style;
		this.prix=prix;
		this.player=p;
	}
	public Player getPlayer() {
		return player;
	}
	public String toString() {
		return "Nom du jeux : "+this.nom+"\n Style de jeux : "
				+this.style+"\n Prix du jeu : " + this.prix+ " \t "+this.player +"\n";
	}
}
