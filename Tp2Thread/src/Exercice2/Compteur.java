package Exercice2;

public class Compteur extends Thread{
	int maxValue;
	String nom;
	
	Compteur(String nom,int maxValue){
		this.nom=nom;
		this.maxValue=maxValue;
	}
	
	public void run() {
		try {
			for(int i=1;i<=maxValue;i++) {
				long time = (long)(Math.random()* 1000);
				System.out.println(" " +nom+": "+i+" "+time+"ms");
				/*Question 2
				sleep(100);*/
				
				//Question 4	
				sleep(time);
			}
		}catch(InterruptedException e) {return;}
	}
}
