
public class Motorbike extends Vehicle{

	private int wheels;
	private boolean kickstart;
	
	
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
		return "Motorbike [wheels=" + wheels + ", kickstart=" + kickstart + "]";
	}
	

}
