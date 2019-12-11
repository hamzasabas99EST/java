package TestServerSocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.*;

public class ClientWorker {
	Socket clienttScoket;
	public ClientWorker(Socket s) {
		this.clienttScoket=s;
	}
	
	public static void main(String[] args)  {}
	
	
	public static void processClientRequest(Socket clientSocket){
		try {
			PrintStream printStream = new PrintStream(clientSocket.getOutputStream() );
			InputStreamReader inputStream = new InputStreamReader(clientSocket.getInputStream());
			BufferedReader bufferedReader = new BufferedReader(inputStream);
			String message = null;
			message = bufferedReader.readLine();
			//Thread.sleep(1100);
			String messageSend = "server:"+message+"\n";
			printStream.println(messageSend );
			printStream.close();
		}catch(IOException ex){
			System.out.println("Serveur : probable d'nvoi du message");
		}
	}
	
}
