
public class Car extends Vehicle{

	private int wheels;
	private boolean radioOn;
	private int numberOfSeats;
	
	public Car(double engineSize, String make, String colour, int wheels, boolean radioOn, int numberOfSeats) {
		this.setEngineSize(engineSize);
		this.setmake(make);
		this.setColour(colour);
		this.wheels = wheels;
		this.radioOn = radioOn;
		this.numberOfSeats = numberOfSeats;
		}
	
	
	
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
	public void setRadioOn(boolean radioOn) {
		this.radioOn = radioOn;
	}
	
	public void setnumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	
	public int getWheels() {
		return wheels;
	}
	
	public boolean getRadioOn() {
		return radioOn;
	}
	
	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	@Override
	public String toString() {
		return super.toString() + "Car [wheels=" + wheels + ", radioOn=" + radioOn + ", numberOfSeats=" + numberOfSeats + "]";
	}
		
}
