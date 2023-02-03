package finalpoject;

import java.util.List;

public class Main {

	static final int TOTAL_TEAMS = 10;
	static final String[] UNI_NAMES = {"HTU","AAU","AIU","AZU","AAU","ASP","PSU","JU1","UOP","YU1"};
	static final String[] TEAMS_NAMES = {"Coder","Javag","Topg1","Eagle","C+123","Orian","Attrb","Param","Semi1","Soul1"};
	  static final int TOTAL_QUESTIONS = 10;
	  static final int CONTEST_DURATION = 300;
	public static void main(String[] args) {
		ASB_System sys = new ASB_System();
List<Teams> teams = sys.GetData(TOTAL_QUESTIONS,TOTAL_TEAMS,CONTEST_DURATION,UNI_NAMES,TEAMS_NAMES);

System.out.print("###########################################################################");
System.out.println();
System.out.print("#  ");
System.out.print("Rank  ");
System.out.print("#  ");
System.out.print("Team ID  ");
System.out.print("#  ");
System.out.print("Team Name  ");
System.out.print("#  ");
System.out.print("Solved Questions  ");
System.out.print("#  ");
System.out.print("Elapsed Time  ");
System.out.print("#");
System.out.println();
System.out.print("###########################################################################");
System.out.println();
for (int i = 0; i < teams.size()-1; i++) {
  System.out.print("#   ");
  System.out.print((i + 1) + "st  ");
  System.out.print("#     ");
  System.out.print(teams.get(i).team_ID+"     ");
  System.out.print("#  ");
  System.out.print(teams.get(i).team_name+"  ");
  System.out.print("#       ");
  System.out.print(teams.get(i).questions_solved + "/" + TOTAL_QUESTIONS+"         ");
  System.out.print("#      ");
  System.out.print(teams.get(i).time_taken+"       ");
  System.out.print("#");
  System.out.println();
}
System.out.print("###########################################################################");

	}

}
