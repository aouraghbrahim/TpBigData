import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Traitement {

	public static void main(String[] args) throws IOException {
		ObjectInputStream ois = null;
		File f = new File("C:\\Users\\b.aouragh.13\\Desktop\\MovieLens\\ml-10M100K\\movies.dat");
		FileInputStream fstream = null;
		
		FileReader file = new FileReader(new File("C:\\Users\\b.aouragh.13\\Desktop\\MovieLens\\ml-10M100K\\movies.dat"));
		BufferedReader br = new BufferedReader(file);
		String temp = br.readLine();
		while (temp != null) {
		   temp = br.readLine();
		   System.out.println(temp);
		}
		
	}
}
