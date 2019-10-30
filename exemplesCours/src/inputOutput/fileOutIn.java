package inputOutput;
import java.io.*;

public class fileOutIn {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		FileInputStream fis=null;
		File f=new File("fichier.txt");
		try {
			
			fis = new FileInputStream(f);
			byte[] buf=new byte[20];
			
			int n;
			while((n=fis.read(buf))>=0) {
				//System.out.print(n+":");
				for(int i=0;i<n;i++)
				System.out.print((char)buf[i]);
			}
			
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally { 
		 try {
			fis.close();
		}catch(IOException e) {e.printStackTrace();}
		}
		
	}

}
