package question2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Analyser {
	ArrayList<RecordModel> listRec;
	private Map<String,Integer> userCntRating;
	private Map<String,Integer> mostRatingUser;

	public Analyser(ArrayList<RecordModel> listRec){
		this.listRec = listRec;
		userCntRating = new HashMap<String, Integer>();
		mapUserCntNote(listRec);
	}
	
	private void mapUserCntNote(ArrayList<RecordModel> listRec){
		for (RecordModel rec: listRec){
			String userID = rec.getUserId();			
			if(userCntRating.containsKey(userID)){
				int cnt = userCntRating.get(userID) + 1;
				userCntRating.replace(userID, cnt);
			} else{
				userCntRating.put(userID, 1);
			}
		}
	}
	
	public Map<String, Integer> getUserCntRating(){
		return userCntRating;
	}
	
	public void calMostRatingUser(){
		mostRatingUser = new HashMap<String, Integer>();
		for(Map.Entry<String, Integer> entry : userCntRating.entrySet()){
			if(mostRatingUser.isEmpty()){
				mostRatingUser.put(entry.getKey(), entry.getValue());
			}
			else{
				int oldMax = mostRatingUser.get(mostRatingUser.keySet().toArray()[0]);
				if(entry.getValue() > oldMax){
					mostRatingUser.clear();
					mostRatingUser.put(entry.getKey(), entry.getValue());
				}
			}
		}
	}
	
	public Map<String, Integer> getMostRatingUser(){
		return mostRatingUser;
	}
}