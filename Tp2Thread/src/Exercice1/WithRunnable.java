package Exercice1;

public class WithRunnable implements Runnable{
	int max=1000;
	int val;
	
	WithRunnable(int valeur){
		val=valeur;
		} 
	
	public void run(){
		if(val==1) {
			incrim();
			}else if(val==1000) decrim();
		}
	//incrimentation
	public void incrim() {
		for(int i=1;i<=max;i++) {
			System.out.println(i+"");
		}
	}
	
	//decrimentation
	public void decrim() {
		for(int i=max;i>=1;i--) {
			System.out.println(i+"");
		}
	}
	
public static void main(String[] args) {
	
		//Runnable
				
				Runnable Tb=new WithRunnable(1000);
				new Thread(Tb).start();
			}
}
