
public class AverageJoe {

	private double price = 17.99;
	private int size = 15;
	private double volumeOfPaint;
	private int coveragePerLitre = 11;
	
		
	public double totalCost(double coverage) {
		
		volumeOfPaint = coverage/coveragePerLitre;
		
		int numberOfCans = (int) ((volumeOfPaint / size) + 1);
	
		double totalCost = numberOfCans * price;
		
		return totalCost; 
		
	}
	
	public double leftOver(double coverage) {
		
		volumeOfPaint = coverage/coveragePerLitre;
		
		int numberOfCans = (int) ((volumeOfPaint / size) + 1);
		
		double leftOver = (numberOfCans * size) - volumeOfPaint;
		return leftOver;
	}

}
