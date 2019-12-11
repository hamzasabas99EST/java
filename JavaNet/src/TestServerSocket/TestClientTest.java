package TestServerSocket;
import java.io.*;
import java.net.*;

public class TestClientTest {
	public static void main(String[] args) throws IOException {
		System.out.println("client");
		Socket clientSocket =null;
		String serverHostName = "localhost";
		int port = 3017;
		
	//	for(int i=0;i<100;i++) {
			try {
				clientSocket = new Socket(serverHostName,port);
				//clientSocket = new Socket("192.168.1.10",1234);
				System.out.println("connected to the server");
			}catch(IOException e) {
				System.out.println("client: impossible douvrir la socket");
			}
			long t = System.currentTimeMillis();
			PrintStream printStream = new PrintStream(clientSocket.getOutputStream());
			InputStreamReader inputStream= new InputStreamReader(clientSocket.getInputStream());
			BufferedReader bufferedReader = new BufferedReader(inputStream);
			String message = "bonjour \n\n";
			
			printStream.print(message);
			printStream.flush();
			message = bufferedReader.readLine();
			System.out.println("serveur : "+message+" "+(System.currentTimeMillis()-t));
		
	//}
		

	}

}

