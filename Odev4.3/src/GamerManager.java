
public class GamerManager implements GamerService{
	
		public void add(Gamer gamer) {
			System.out.println(gamer.getFirstName()+" adl� kullan�c� eklendi");
		}
		public void delete(Gamer gamer) {
			System.out.println(gamer.getFirstName()+" adl� kullan�c� silindi");
		}
		public void update(Gamer gamer) {
			System.out.println(gamer.getFirstName()+" adl� kullan�c� g�ncellendi");
		}
}
