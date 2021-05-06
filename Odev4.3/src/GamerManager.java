
public class GamerManager implements GamerService{
	
		public void add(Gamer gamer) {
			System.out.println(gamer.getFirstName()+" adlý kullanýcý eklendi");
		}
		public void delete(Gamer gamer) {
			System.out.println(gamer.getFirstName()+" adlý kullanýcý silindi");
		}
		public void update(Gamer gamer) {
			System.out.println(gamer.getFirstName()+" adlý kullanýcý güncellendi");
		}
}
