package Exercice3;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		Valeur myval=new Valeur(0);
		Runnable job1=new Ajob( myval,1);
		Runnable job2=new Ajob( myval,-1);
		
		Thread J1=new Thread(job1);
		Thread J2=new Thread(job2);
		
		J1.start();
		J2.start();
		
		}
	
}
