package finalpoject;//package

public class Teams implements Comparable<Teams> //Teams class
{
	
//initialization of variables
	
	public int time_taken;
	public String uni;
	public int team_ID;
	public String team_name;
	public String[] student_name = new String [3];
	public int questions_solved;
	public Teams(String uni, String team_name, int team_ID, int questions_solved, int time_taken) 
	{
		
		this.uni = uni;
		this.team_name = team_name;
		this.team_ID = team_ID;
		this.questions_solved = questions_solved;
		this.time_taken = time_taken;
	}
//set and get for the variables
	
	public Teams() 
	{
		
	}

	public String getUni() {
		return uni;
	}

	public void setUni(String uni) {
		this.uni = uni;
	}

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}

	public int getTeam_ID() {
		return team_ID;
	}

	public void setTeam_ID(int team_ID) {
		this.team_ID = team_ID;
	}

	public int getQuestions_solved() {
		return questions_solved;
	}

	public void setQuestions_solved(int questions_solved) {
		this.questions_solved = questions_solved;
	}

	public int getTime_taken() {
		return time_taken;
	}

	public void setTime_taken(int time_taken) {
		this.time_taken = time_taken;
	}
	 @Override
	    public int compareTo(Teams o) {
	        return toString().compareTo(o.toString());
	    }
	
	
	
}