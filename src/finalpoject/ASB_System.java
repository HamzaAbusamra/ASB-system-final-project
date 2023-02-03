package finalpoject;//package
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ASB_System //ABS_System Class
{
	//list function to sort all record of the teams
	
	public List<Teams> SetRanking(Teams[] arrayOfTeams) {
	// to be able to sort the array using collections i had to convert it to list 
		List<Teams> sorteditems = Arrays.asList(arrayOfTeams);

 Collections.sort(sorteditems, (s1, s2) ->
 Integer.compare(s2.getQuestions_solved(), s1.getQuestions_solved()));
return sorteditems;
 }
	
	// this function fill the array 
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
	// generate a random integer to be used for the solved questions and time taken
	public int RandomInteger(int minInteger,int maxInteger) {
		int randomNum = ThreadLocalRandom.current().nextInt(minInteger, maxInteger);
		return randomNum;
			
	}
	
}
