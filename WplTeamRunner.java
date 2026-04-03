class WplTeamRunner{

	public static void main(String[] args){

		WplTeam rcb = new WplTeam("Royal Challengers Bangalore","Smriti Mandhana","Luke Williams","Diageo India","Red and Black");
		rcb.displayWplTeamDetails();

		WplTeam mi = new WplTeam("Mumbai Indians","Harmanpreet Kaur","Charlotte Edwards","Reliance Industries","Blue");
		mi.displayWplTeamDetails();

		WplTeam dc = new WplTeam("Delhi Capitals","Meg Lanning","Jonathan Batty","JSW Group","Blue and Red");
		dc.displayWplTeamDetails();

		WplTeam upw = new WplTeam("UP Warriorz","Alyssa Healy","Jon Lewis","Capri Global","Purple and Yellow");
		upw.displayWplTeamDetails();

		WplTeam gg = new WplTeam("Gujarat Giants","Beth Mooney","Michael Klinger","Adani Sportsline","Orange");
		gg.displayWplTeamDetails();

	}
}