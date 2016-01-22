package question2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MyFile {
	String path= "E:\\Dev\\BigData\\u.data";
	BufferedReader br;
	StringBuffer sb;
	File f;
	
	public MyFile(){
		f = new File(path);
	}
	
	public String convertFileIntoString() throws IOException{
		String result = null;
		br = new BufferedReader(new FileReader(f));
		
		result = br.readLine();
		while(result != null){
			sb.append(result+"\n");
			result = br.readLine();
		}
		br.close();
		return sb.toString();		
	}
	
	public String readLineIntoStr() throws IOException{
		if(f == null){
			throw new IOException();
		}        
        br = new BufferedReader(new FileReader(f));
        return br.readLine();
	}
	
}
