
public class CampaignManager implements CampaignService{
	
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" adl� kampanya eklendi");
	}
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" adl� kampanya bitti");
	}
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" adl� kampanya g�ncellendi");
	}
}
