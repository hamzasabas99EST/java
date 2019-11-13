
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.io.*;

public class FileCPnio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     FileInputStream fis;
     BufferedInputStream bis;
     FileChannel fc;
     
     try { 
    	 fis = new FileInputStream(new File ("fichier.txt"));
    	 bis = new BufferedInputStream(fis);
    	 long time= System.currentTimeMillis();  
    	 while(bis.read() != -1);
    	 System.out.println(" Temps d'execution avec BufferedInputStream : " + (System.currentTimeMillis()-time));
    	 fis = new FileInputStream(new File ("fichier.txt"));
    	 fc = fis.getChannel();
    	 int size = (int)fc.size();
    	 ByteBuffer bBuff = ByteBuffer.allocate(size);
    	 time = System.currentTimeMillis(); 
    	 
    	 fc.read(bBuff);
    	 bBuff.flip();
    	 System.out.println(" Temps d'execution avec FileChannel : " + (System.currentTimeMillis()-time));
    	 byte[] tabByte = bBuff.array();
    	 
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
	}

}
