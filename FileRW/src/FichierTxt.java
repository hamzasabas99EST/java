import java.io.*;

public class FichierTxt {

	public static void main(String[] args) {
		File file=new File("fichier.txt");
		FileWriter fw;
		FileReader fr;
		
		try {
			fw=new FileWriter(file);
			String str="Bonjour à tous \n";
			str+="\tComment allez vous ? \n";
			fw.write(str);
			fw.close();
			fr=new FileReader(file);
			str="";
			int i=0;
			while((i=fr.read())!=-1) str+=(char)i;
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}

}
