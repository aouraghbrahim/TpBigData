package question2;

public class RecordModel {
	private String line;
	private String userID;
	private String movieID;
	private String rating;
	private String timestamp;
	
	public RecordModel(String line){
		this.line = line;
		initData(line);
	}
	
	public String getLine(){
		return line;
	}
	
	public String getUserId(){
		return userID;
	}
	
	public String getMovieId(){
		return movieID;
	}
	
	public String getRating(){
		return rating;
	}
	
	public String getTimeStamp(){
		return timestamp;
	}
	
	private void initData(String strLine){
		String[] listStr = strLine.split("\t");
		userID = listStr[0];
		movieID = listStr[1];
		rating = listStr[2];
		timestamp = listStr[3];
	}
}