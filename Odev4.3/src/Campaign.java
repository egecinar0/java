
public class Campaign {
		String companyName;
		String campaignName;
		double discountRate;

		public Campaign(String companyName, String campaignName, double discountRate) {
			super();
			this.companyName = companyName;
			this.campaignName = campaignName;
			this.discountRate = discountRate;
		}
		public Campaign() {
			
		}
		
		
		public String getCompanyName() {
			return companyName;
		}
		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}
		public String getCampaignName() {
			return campaignName;
		}
		public void setCampaignName(String campaignName) {
			this.campaignName = campaignName;
		}
		public double getDiscountRate() {
			return discountRate;
		}
		public void setDiscountRate(double discountRate) {
			this.discountRate = discountRate;
		}
		
}
