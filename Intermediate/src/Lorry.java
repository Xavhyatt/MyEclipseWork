
public class Lorry extends Vehicle {
	
	private int capacity;
	private int height;
	
	public Lorry(double engineSize, String make, String colour, int capacity, int height) {
		this.setEngineSize(engineSize);
		this.setmake(make);
		this.setColour(colour);
		this.capacity = capacity;
		this.height = height;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public int getHeight() {
		return height;
	}
	@Override
	public String toString() {
		return super.toString() + "Lorry [capacity=" + capacity + ", height=" + height + "]";
	}
	
}
