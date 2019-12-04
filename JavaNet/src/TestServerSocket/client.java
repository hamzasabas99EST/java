package TestServerSocket;

import java.io.*;
import java.net.*;

public  class client {

	public static void main(String[] args) {
		System.out.println("=================Client=================");
		Socket soc=null;
		/*String hostname="192.168.1.3";
		int port =1234;*/
			try {
				//soc=new Socket(hostname,port);
				soc=new Socket(InetAddress.getLocalHost(),2117);
				
				PrintStream printStream=new PrintStream(soc.getOutputStream());
				printStream.print("Bonjour B17\n\n");
				
				soc.close();
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
	}

}
