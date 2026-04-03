class WomenKabaddiTeam{

	String teamName;
	String captainName;
	static int noOfPlayers = 7;
	String coachName;
	String state;
	String jerseyColour;

	public WomenKabaddiTeam(){
	}

	public WomenKabaddiTeam(String teamName,String captainName,String coachName,String state,String jerseyColour){

		this.teamName = teamName;
		this.captainName = captainName;
		this.coachName = coachName;
		this.state = state;
		this.jerseyColour = jerseyColour;
	}

	public void displayKabaddiTeamDetails(){

		System.out.println("Team Name:"+teamName);
		System.out.println("Captain Name:"+captainName);
		System.out.println("No Of Players:"+noOfPlayers);
		System.out.println("Coach Name:"+coachName);
		System.out.println("State:"+state);
		System.out.println("Jersey Colour:"+jerseyColour);
		System.out.println("---------------------------");
	}
}