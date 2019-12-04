
public class Compte implements Runnable {
	int valeur;
	
	Compte(int val){
		valeur=val;
	
	}
	
	public void run() {
		try {
			  for(;;) {
				System.out.println(valeur+" ");
				Thread.sleep(100);
			
			  }
			
		}catch(InterruptedException e) {
			return;}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable compte1=new Compte(1);
		Runnable compte2=new Compte(200);
		new Thread(compte1).start();
		new Thread(compte2).start();
		
		/*new Compte(1,"Sabas").start();
		new Compte(200,"Elfilali").start();
		*/
	}

}
