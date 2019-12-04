import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestPort {

	public static void main(String[] args) {
		System.out.println("Liste des ports ouvert :");
		Socket soc=null;
		for(int i=1;i<=6550;i++) {
			try {
				soc =new Socket("127.0.0.1",i);
				System.out.println(i);
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {}
			finally {
				if(soc!=null) {
					try {
						soc.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		
	}

}
