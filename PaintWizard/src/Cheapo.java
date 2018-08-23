
public class Cheapo {
	
	private double price = 19.99;
	private int size = 20;
	private double volumeOfPaint;
	private int coveragePerLitre = 10;
	
	
	public double totalCost(double coverage) {
		
		volumeOfPaint = coverage/coveragePerLitre;
		double numberOfCans=  volumeOfPaint / size;
		
		if (numberOfCans == (int) numberOfCans) {
			double totalCost = numberOfCans * price;
			return totalCost;
		}
		
		else {
		
		numberOfCans = (int) ((volumeOfPaint / size) + 1);
		double totalCost = numberOfCans * price;
		return totalCost;
		}
		
	}
	
	public double leftOver(double coverage) {
		
		volumeOfPaint = coverage/coveragePerLitre;
		double numberOfCans = volumeOfPaint / size;
		
		if (numberOfCans == (int) numberOfCans) {
			double leftOver = (numberOfCans * size) - volumeOfPaint;
			return leftOver;
		}
		
		else {
			numberOfCans = (int) ((volumeOfPaint / size) + 1);
			double leftOver = (numberOfCans * size) - volumeOfPaint;
			return leftOver;
		}
	}
}
	
		
//	public double totalCost(double coverage) {
//		
//		volumeOfPaint = coverage/coveragePerLitre;
//		
//		int numberOfCans = (int) ((volumeOfPaint / size) + 1);
//	
//		double totalCost = numberOfCans * price;
//		
//		return totalCost; 
//		
//	}
//	
//	public double leftOver(double coverage) {
//		
//		volumeOfPaint = coverage/coveragePerLitre;
//		
//		int numberOfCans = (int) ((volumeOfPaint / size) + 1);
//		
//		double leftOver = (numberOfCans * size) - volumeOfPaint;
//		return leftOver;
//	}
//	
//}
