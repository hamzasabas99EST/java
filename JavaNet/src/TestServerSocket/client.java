package TestServerSocket;

import java.io.*;
import java.net.*;

public  class client {

	public static void main(String[] args) throws IOException {
		System.out.println("=================Client=================");
		Socket soc=null;
			try {
				String hostname="192.168.1.10";
				//int port =1234;
				//soc=new Socket(hostname,port);
				soc=new Socket("192.168.1.200",3016);
				System.out.println("En ecoute");
				String message="Hello b17 \n";
				PrintStream printStream=new PrintStream(soc.getOutputStream());
				printStream.print(message);
				
				soc.close();
				System.out.println("Message envoye");
			} catch (IOException e) {
				
			}
			
		
		
	}
}


		
			//soc=new Socket(InetAddress.getLocalHost(),3019);
			/*InputStreamReader inputStream =new InputStreamReader(soc.getInputStream());
				BufferedReader bufferedReader =new BufferedReader(inputStream);
				PrintStream printStream=new PrintStream(soc.getOutputStream());
				String message="Hello";
				
				printStream.print(message);
				message=bufferedReader.readLine();*/
		
	
