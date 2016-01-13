import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Traitement {

	public static void main(String[] args) {
	
		FileInputStream fstream = null;
		try {
			fstream = new FileInputStream("movies.dat");
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
