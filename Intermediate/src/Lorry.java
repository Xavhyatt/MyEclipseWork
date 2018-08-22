
public class Lorry extends Vehicle {
	
	private int capacity;
	private int height;
	
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
		return "Lorry [capacity=" + capacity + ", height=" + height + "]";
	}
	
}
