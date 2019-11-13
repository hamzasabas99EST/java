import java.io.*;

public class FileToConsoleData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataInputStream dis;
		DataOutputStream dos;
		try {
			
			dos =new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File("data.txt"))));
			dos.writeByte(100);
			dos.writeChar('C');
			dos.writeDouble(12.05);
			dos.writeFloat(34.5f);
			dos.writeInt(1748);
			dos.close();
			dis =new DataInputStream(new BufferedInputStream(new FileInputStream(new File("data.txt"))));
			System.out.println(dis.readByte());
			System.out.println(dis.readByte());
			System.out.println(dis.readByte());
			System.out.println(dis.readByte());
			System.out.println(dis.readByte());
			System.out.println(dis.readByte());
			System.out.println(dis.readByte());
			dis.close();
		}catch(FileNotFoundException e) {e.printStackTrace(); } 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}


