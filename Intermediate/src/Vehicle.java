
public class Vehicle {

	private double engineSize;
	private String make;
	private String colour;
	private static int baseCost = 100;
	
	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;		
	}
	
	public void setmake(String make) {
		this.make = make;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public double getEngineSize() {
		return engineSize;
	}
	public String getMake() {
		return make;
	}
	public String getColour() {
		return colour;
	}
	public static int getBaseCost() {
		return baseCost;
	}
	public void move() {
		System.out.println("Vehicle is moving");
	}
	

	@Override
	public String toString() {
		return "Vehicle [engineSize=" + engineSize + ", make=" + make + ", colour=" + colour + ", Type: ";
	}
	
	
	
	
}
