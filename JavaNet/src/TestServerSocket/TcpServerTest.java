package TestServerSocket;
import java.io.*;
import java.net.*;
public class TcpServerTest {
	public static void main(String[] args) {
		System.out.println("serveur");
		ServerSocket serverSocket =null;
		int port =3017;
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("serveur: ok sur le port="+port);	
		}catch(IOException ex){
			System.out.println("serveur:Impossible, creer le serveur avec le port="+port);
		}
		while(true) {
			Socket clientSocket = null;
			try {
				System.out.println("j'attend un client");
				clientSocket = serverSocket.accept();
				processClientRequest(clientSocket);
				//clientSocket.close();
			}catch(IOException ex){
				System.out.println("serveur:can not accept the client request, exit program");
			}
		
		}
	}

	public static void processClientRequest(Socket clientSocket) {
		try {
			PrintStream printStream = new PrintStream(clientSocket.getOutputStream() );
			InputStreamReader inputStream = new InputStreamReader(clientSocket.getInputStream());
			BufferedReader bufferedReader = new BufferedReader(inputStream);
			String message = null;
			message = bufferedReader.readLine();
			System.out.println("Hi client your message is "+message);
	     	Thread.sleep(1100);
			String messageSend = "I get your message \n";
			printStream.println(messageSend );
			printStream.close();
		}catch(IOException ex){
			System.out.println("Serveur : probable d'nvoi du message");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
