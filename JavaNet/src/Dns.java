import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Dns {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Saissez une adresse :");
		String hote=sc.nextLine();
		String result="";
		
		try {
			if(hote.matches("[a-zA-Z\\.]+")) 
				result=InetAddress.getByName(hote).getHostAddress();
			else result=InetAddress.getByName(hote).getHostName();
			System.out.println(result);
		} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


