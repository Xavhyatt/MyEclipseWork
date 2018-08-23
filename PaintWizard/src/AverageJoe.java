
public class AverageJoe {

	private double price = 17.99;
	private int size = 15;
	private double volumeOfPaint;
	private int coveragePerLitre = 11;
	
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
