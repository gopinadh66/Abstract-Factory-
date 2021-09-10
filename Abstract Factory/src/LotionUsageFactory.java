
public class LotionUsageFactory extends LotionAbstarctFactory {

	@Override
	Lotion getLotionType(String type) {
		 
		return null;
	}

	@Override
	LotionPurpose getLotionUsage(String use) {
		
		if(use.equalsIgnoreCase("Body lotion")) {
			return new BodyLotionUsage();
		}else {
			return new FaceLotionUsage();
		}
		 
	 
	}

}
