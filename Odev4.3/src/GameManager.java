
public class GameManager implements GameService {

	public void add(Game game) {
		Game gamee = new Game();	
			System.out.println(game.getGameName()+" adl� oyun eklendi - "+ gamee.getAfterDiscountPrice()+" TL.");
		}
	public void delete(Game game) {
		System.out.println(game.getGameName()+" adl� oyun silinmi�tir.");
	}
	public void update(Game game) {
		System.out.println(game.getGameName()+" adl� oyun g�ncellendi.");
	}
	
		
	}
	
	
	
	
	
	

