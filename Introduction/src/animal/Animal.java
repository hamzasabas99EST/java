package animal;

public class Animal {
	public static int nbrAnimal=0;
	private String nom;
	private int age;
	public int poid;
	private double speed;
	private int id;
	
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPoid() {
		return poid;
	}
	public void setPoid() {
		this.poid = (int)(Math.random()*60+1);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Animal() {
		this.nbrAnimal++;
		
	}
	public Animal(int age,String nom) {
		this.nbrAnimal++;
		this.age=age;
		this.nom=nom;
		this.setPoid();
	}
	public String toString() {
		return this.nom+" "+this.age+" "+this.poid;
				
	}
	public String parler() {
		return "www";
	}
}
