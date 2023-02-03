package finalpoject;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ASB_System 
{
	public List<Teams> SetRanking(Teams[] arrayOfTeams) {
				
		List<Teams> sorteditems = Arrays.asList(arrayOfTeams);

 Collections.sort(sorteditems, (s1, s2) ->
 Integer.compare(s2.getQuestions_solved(), s1.getQuestions_solved()));
return sorteditems;
 }
	
	
	public List<Teams> GetData(int totalQuestion, int totalTeams, int Maxduration, String[] uniList, String[] teamsList) {
		Teams arrayOfTeams[ ]= new Teams[totalTeams];

		for (int i = 0; i < totalTeams; i++) {
			Teams Team = new Teams();
			Team.setQuestions_solved(RandomInteger(0,totalQuestion));
			Team.setTeam_ID(i);
			Team.setTeam_name(teamsList[i]+ "-"+uniList[i]);
			Team.setTime_taken(RandomInteger(100,Maxduration));
			Team.setUni(uniList[i]);
			arrayOfTeams[i] = Team;
		}
		List<Teams> sortedItems = SetRanking(arrayOfTeams);
		return sortedItems;
			
	}
	
	public int RandomInteger(int minInteger,int maxInteger) {
		int randomNum = ThreadLocalRandom.current().nextInt(minInteger, maxInteger);
		return randomNum;
			
	}
	public String getAlphaNumericString(int n)
	 {
		  String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz";
		 
		  StringBuilder sb = new StringBuilder(n);
		  for (int i = 0; i < n; i++) {
		   int index
		    = (int)(AlphaNumericString.length()
		      * Math.random());
		   sb.append(AlphaNumericString
		      .charAt(index));
		  }
		  return sb.toString();
		 }

}
