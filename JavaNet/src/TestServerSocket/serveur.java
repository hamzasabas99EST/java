package TestServerSocket;

import java.net.ServerSocket;
import java.io.*;
import java.net.*;

public class serveur {

	public static void main(String[] args)  {
		
		System.out.println("=================Serveur=================");
		ServerSocket sol=null;
		Socket soc=null;
	while(true) {
		try {
			
			sol=new ServerSocket(3017);
			System.out.println("Serveur : OK sur le port ");
			soc=sol.accept();
				System.out.println("un client s'est connecté!");
				BufferedInputStream bis =new BufferedInputStream(soc.getInputStream());
				StringBuilder sb =new StringBuilder();
				int n;
				while((n=bis.read())!=-1) {
					sb.append((char)n);
				}
				System.out.print(sb);
			//processClientRequest(soc);
				sol.close();
				soc.close();
		} catch (IOException e) {
			e.printStackTrace();
			return ;
		}
	}
		
	
	}
			
	

	public static void processClientRequest(Socket soc ) throws IOException{
		
		try {
			PrintStream printStrem=new PrintStream(soc.getOutputStream());
			InputStreamReader inputStream =new InputStreamReader(soc.getInputStream());
			BufferedReader bufferedReader =new BufferedReader(inputStream);
			String message=null;
			message=bufferedReader.readLine();
			Thread.sleep(10000);
			String messageSend="Serveur"+message+"\n";
			printStrem.println(messageSend);
			printStrem.close();
		}catch(Exception e) {
			System.out.println("Serveur :problem d envoi du message!");
		}
	}
}
