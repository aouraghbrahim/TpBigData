import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class Traitement {

	public static void main(String[] args) throws IOException {
		
		 ArrayList<String> tem = new ArrayList<String>();

		FileReader file = new FileReader(new File("C:\\Users\\b.aouragh.13\\Desktop\\MovieLens\\ml-100k\\u.data"));
		BufferedReader br = new BufferedReader(file);
		String t;
		while ((t = br.readLine()) != null)
		{
		    tem.add(t);
		   
		}
		String result = null;
		for(int i=0;i<tem.size();i++){
			 result=tem.get(i);	
			 String values[]=result.split("	");
			 System.out.println(values[i]);
		}
		
	}
}
