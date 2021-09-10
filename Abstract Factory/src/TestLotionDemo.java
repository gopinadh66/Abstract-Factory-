
public class TestLotionDemo {
	
	public static void main(String args[]) {
		
		//Abstarct factory implemention
		LotionAbstarctFactory lf = new LotionFactory();
		
		System.out.println("Type of lotions and usages of lotions \n \n***********************************************************\n");
		
		lf.getLotionType("Body");
		
		LotionAbstarctFactory usage = new LotionUsageFactory();
		
		usage.getLotionUsage("Body lotion");
	}

}
