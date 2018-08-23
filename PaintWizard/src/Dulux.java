
public class Dulux {

	private double price = 25;
	private int size = 10;
	private double volumeOfPaint;
	private int coveragePerLitre = 20;
		
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
