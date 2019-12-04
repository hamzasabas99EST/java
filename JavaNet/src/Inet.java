import java.net.InetAddress;
import java.net.UnknownHostException;

public class Inet {
	public static void main(String[] args ) {
		try {
			InetAddress address=InetAddress.getLocalHost();
			address=InetAddress.getByAddress(new byte[] {(byte)192,(byte)168,2,44});
			/*address=InetAddress.getBy
			address=InetAddress.getBy*/
			
			/*System.out.println("Nom :"+address.getHostName());
			System.out.println("Addresse :"+address.getHostAddress());
			System.out.println("Nom canonique :"+address.getCanonicalHostName());
			*/
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
