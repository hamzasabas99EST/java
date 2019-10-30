package inputOutput;

import java.io.*;

public class FileCopy {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		FileInputStream fis=null;
		File f=new File("fichier.txt"); 
		try {
			fis =new FileInputStream(f);
			fos =new FileOutputStream(new File("copyfile.txt"));
			int n;
			long t=System.currentTimeMillis();
			byte[] buf=new byte[20];
			while((n=fis.read(buf))>=0) {
				for(int i=0;i<n;i++)
				fos.write(buf[i]);
			}
			System.out.print("Copie est terminé dans :"+(System.currentTimeMillis()-t)+"ms");
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally { 
			 try {
				fis.close();
				fos.close();
			}catch(IOException e) {e.printStackTrace();}
		}
		
		
		

	}

}
