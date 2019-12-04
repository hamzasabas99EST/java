package Exercice1;

public class WithThread extends Thread {
	int max=1000;
	int val;
	
	WithThread(int valeur){val=valeur;} 
	public void run(){
		if(val==1) {incrim();}
		else if(val==1000) decrim();
		}
	
	public void incrim() {
		for(int i=1;i<=max;i++) {
			System.out.println(i+"");
		}
	}
	
	public void decrim() {
		for(int i=max;i>=1;i--) {
			System.out.println(i+"");
		}
	}
	
	public static void main(String[] args) {
			
		//Thread
		WithThread TA=new WithThread(1);
		TA.start();
		WithThread TB=new WithThread(1000);
		TB.start();
	}
	
}
