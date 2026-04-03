class WomenFootballTeam{

	String teamName;
	String captainName;
	static int noOfPlayers = 11;
	String coachName;
	String country;
	String jerseyColour;

	public WomenFootballTeam(){
	}

	public WomenFootballTeam(String teamName,String captainName,String coachName,String country,String jerseyColour){

		this.teamName = teamName;
		this.captainName = captainName;
		this.coachName = coachName;
		this.country = country;
		this.jerseyColour = jerseyColour;
	}

	public void displayFootballTeamDetails(){

		System.out.println("Team Name:"+teamName);
		System.out.println("Captain Name:"+captainName);
		System.out.println("No Of Players:"+noOfPlayers);
		System.out.println("Coach Name:"+coachName);
		System.out.println("Country:"+country);
		System.out.println("Jersey Colour:"+jerseyColour);
		System.out.println("---------------------------");
	}
}