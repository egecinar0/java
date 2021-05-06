
public class Game {
		String gameName;
		double gamePrice;
		double afterDiscountPrice;
		int gameId;
		public Game(String gameName, double gamePrice, int gameId) {
			super();
			this.gameName = gameName;
			this.gamePrice = gamePrice;
			this.gameId = gameId;
		}
		public Game() {}
		public String getGameName() {
			return gameName;
		}
		public void setGameName(String gameName) {
			this.gameName = gameName;
		}
		public double getGamePrice() {
			return gamePrice;
		}
		public void setGamePrice(double gamePrice) {
			this.gamePrice = gamePrice;
		}
		Campaign campaign =new Campaign();
		public double getAfterDiscountPrice() {
			return getGamePrice() / 100 * campaign.discountRate;
		}
		public int getGameId() {
			return gameId;
		}
		public void setGameId(int gameId) {
			this.gameId = gameId;
		}
		
		
}
