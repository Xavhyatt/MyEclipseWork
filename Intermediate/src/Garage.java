import java.util.ArrayList;

public class Garage {
	
	private int numberOfBays;
	private int numberOfMechanics;
	
	
	public void setNumberOfBays(int numberOfBays) {
		this.numberOfBays = numberOfBays;
	}
	
	public void setNumberofMechanics(int numberOfMechanics) {
		this.numberOfMechanics = numberOfMechanics;
	}
	
	public static ArrayList<Object> vehicles = new ArrayList<Object>();
	
	
	static double costToFix(ArrayList<Object> vehicles2) {
	
		for (int i = 0; i<vehicles.size() ; i++) {
			if ((vehicles.get(i).getClass())== Car.class) {
			double c = 0;
			c = Vehicle.getBaseCost() * 1.5;
			return c;
			}
			if ((vehicles.get(i).getClass())==Motorbike.class) {
				double b = 0;
				b = Vehicle.getBaseCost() * 1.3;
				return b;
			}
			else if ((vehicles.get(i).getClass())==Lorry.class) {
				double d = 0;
				d = Vehicle.getBaseCost() * 2.5;
				return d;
			}
		}
		return Vehicle.getBaseCost();
	
	}
}