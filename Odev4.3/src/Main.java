
public class Main {
	
	public static void main(String[] args) {
		
		Gamer gamer = new Gamer("12345678901","Ege","??nar","4.4.2007", 101);
		Campaign campaign = new Campaign("S?per ?irket","S?per ?ndirim",1.20);
		Game game = new Game("Cyberpunk 2077",250,102);
		
		GamerManager gamerManager = new GamerManager();
		CampaignManager campaignManager = new CampaignManager();
		GameManager gameManager = new GameManager();
		
		gameManager.add(game);
		campaignManager.add(campaign);
		gamerManager.add(gamer);
	}
}
