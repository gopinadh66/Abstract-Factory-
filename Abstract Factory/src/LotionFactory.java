
public class LotionFactory extends LotionAbstarctFactory {

	@Override
	Lotion getLotionType(String type) {
		
		if(type.equalsIgnoreCase("Body")) {
			return new BodyLotion();
		}else {
			return new FaceLotion();
		}
		
		 
	}

	@Override
	LotionPurpose getLotionUsage(String use) {
		 
		return null;
	}

}
