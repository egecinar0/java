
public class CampaignManager implements CampaignService{
	
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" adlý kampanya eklendi");
	}
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" adlý kampanya bitti");
	}
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" adlý kampanya güncellendi");
	}
}
