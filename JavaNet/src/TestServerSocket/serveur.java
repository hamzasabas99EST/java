package TestServerSocket;

import java.net.ServerSocket;
import java.io.IOException;
import java.net.*;

public class serveur {

	public static void main(String[] args) {
	System.out.println("=================Serveur=================");
	ServerSocket sol=null;
	Socket soc=null;
	try {
		while(true) {
		sol=new ServerSocket(2117);
		System.out.println("Serveur : OK sur le port ");
		soc=sol.accept();
		System.out.println("un client s'est connecté!");
		sol.close();
		soc.close();}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	}

}
