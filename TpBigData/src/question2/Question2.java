package question2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Question2 {
	public void doJob() throws IOException{
		MyFile f = new MyFile();
		String fileContent = f.convertFileIntoString();
		String[] lines = fileContent.split("\n");
		ArrayList<String> listLine = new ArrayList<String>(Arrays.asList(lines));
		ArrayList<RecordModel> listRec = new ArrayList<RecordModel>();
		
		for(String line:listLine){
			RecordModel rec = new RecordModel(line);
			listRec.add(rec);
		}
		
		Analyser a = new Analyser(listRec);
		Map<String, Integer> map = a.getUserCntRating();
		
		a.calMostRatingUser();
		for(Map.Entry<String, Integer> entry : a.getMostRatingUser().entrySet()){
			System.out.println("User: " + entry.getKey() + ", Count: " + entry.getValue()); 
		}
		
	}
}

