package inputOutput;
import java.io.*;
public class file {

	public static void main(String[] args) {
		
		File f =new File("/");
			// File[] files=f.listFiles();
			 int i=0;
			 for(File nom : f.listFiles() ) {
				 if(nom.isDirectory()) {
				 System.out.printf("%d- %s",i+1,nom.getName()+"/");
				 }else System.out.printf("%d- %s",i+1,nom.getName());
				 System.out.print("\t\t");
				i++;
				if(i%4==0) {
					
					System.out.print("\n\n");
				}
			 }
			 
		}
		
	

}
