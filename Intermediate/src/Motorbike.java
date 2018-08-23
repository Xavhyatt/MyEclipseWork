
public class Motorbike extends Vehicle{

	private int wheels;
	private boolean kickstart;
	
	public Motorbike(double engineSize, String make, String colour, int wheels, boolean kickstart) {
		this.setEngineSize(engineSize);
		this.setmake(make);
		this.setColour(colour);
		this.wheels = wheels;
		this.kickstart = kickstart;
		}
	
	
	public void setwheels(int wheels) {
		this.wheels = wheels;
	}
	
	public void setkickstart(boolean kickstart) {
		this.kickstart = kickstart;
	}
	
	public int getWheels() {
		return wheels;
	}
	
	public boolean getKickstart() {
		return kickstart;
	}

	@Override
	public String toString() {
		return super.toString() + "Motorbike [wheels=" + wheels + ", kickstart=" + kickstart + "]";
	}
	

}
