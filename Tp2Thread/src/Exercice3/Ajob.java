package Exercice3;

public class Ajob implements Runnable{
	
	 Valeur myVal;
	 int i;
	 
	 Ajob(Valeur myVal,int i){
		 this.myVal=myVal;
		 this.i=i;
	 }
	 
	 public void run() {
		 for(i=0;i<= Math.pow(10, 6);i++) {
			 this.myVal.add(i);
		
		 }
		 System.out.println(this.myVal.toString());
	 }
	

}
