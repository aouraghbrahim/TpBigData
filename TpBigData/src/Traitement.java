import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Traitement {

	public static void main(String[] args) {
	
		File f = new File("C:\Users\b.aouragh.13\Desktop\MovieLens\movies.dat");
		FileInputStream fstream = null;
		try {
			fstream = new FileInputStream("f");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			ObjectInputStream ois = new ObjectInputStream(fstream);
		} catch (IOException e) {
			e.printStackTrace();
		}  
	}
}
