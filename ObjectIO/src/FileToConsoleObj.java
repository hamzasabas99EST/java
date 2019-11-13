import java.io.*;

public class FileToConsoleObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectInputStream ois;
		ObjectOutputStream oos;
		 try {
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("game.txt"))));
			oos.writeObject(new Game("Assasin Creed","Adventure",45.69,new Player("soula",15)));
			oos.writeObject(new Game("Tomb Raider","Platforme",23.69,new Player("Hamza",15)));
			oos.writeObject(new Game("Pes 2020","Sport",35.69,new Player("James",15)));
			oos.close();
			ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("game.txt")))); 
			
			try {
				
				System.out.println((ois.readObject()));
				System.out.println(((Game)ois.readObject()).toString());
				System.out.println(((Game)ois.readObject()).toString());
				 
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		 
		 } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
